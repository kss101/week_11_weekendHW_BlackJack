import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        this.deck = new Deck();
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void countPlayers(){
        players.size();
    }

    public ArrayList<Player> getPlayer(){
        return players;
    }

    public Player createGame(){
        //Get number of players...
        int numOfPlayers = 2; // Can be passed in later!
        //For each player create player Object
        for(int i = 1; i < numOfPlayers+1; i++){
            Player player = new Player("Player_"+i);
            // and call addPlayerToGame(player)
            addPlayerToGame(player);
        }
        //Call createDeck to get a new shuffled deck
        deck.createDeck();
        //For each player call dealTopCard()
        for(Player player : players) {
            Card dealtCard = deck.dealTopCard();
            player.setHand(dealtCard);
            System.out.println(player.getName() + " has the " + dealtCard.getRank() + " of " + dealtCard.getSuit());
        }
        int highest = 0;
        Player theWinner = null;
        for(Player player : players){
            if (player.handTotal() > highest){
                //get the values of the cards dealt
                highest = player.handTotal();
                theWinner = player;
            }
        }
        //winner has the highest value!
        return theWinner;
    }
}
