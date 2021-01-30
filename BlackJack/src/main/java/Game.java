import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        this.deck = new Deck();
    }

    public int countPlayers(){
        return players.size();
    }

    public ArrayList<Player> getPlayer(){
        return players;
    }

    public void setPlayers(int numOfPlayers){
        for(int i = 0; i < numOfPlayers; i++){
            Player player = new Player("Player_"+(i+1));
            players.add(player);
        }
    }

    public void setDealer(){
        Player dealer = new Player("Dealer");
        players.add(dealer);
    }

    public void createGame(){
        setDealer();
        //Get number of players...
        int numOfPlayers = 1; // Can be passed in later!
        //For each player create player Object
        setPlayers(numOfPlayers);
        //Call createDeck to get a new shuffled deck
        deck.createDeck();
        //For each player deal first card
        for(Player player : players) {
            dealCard(player);
        }
        //For each player deal second card
        for(Player player : players) {
            dealCard(player);
        }

    }

    public void dealerTwistCheck(Player player){
        int dealerTot = player.handTotal();
        for( int i  = 0; dealerTot < 16; i++){
            System.out.println("Dealer has " + dealerTot + ". Dealer twists...");
            dealCard(player);
            dealerTot = player.handTotal();
        }
        if (dealerTot >= 16){
            System.out.println("Dealer has " + dealerTot + ". Dealer sticks!");
        }

    }

    public void dealCard(Player player){
        Card dealtCard = deck.dealTopCard();
        player.setHand(dealtCard);
        System.out.println(player.getName() + " has been dealt the " + dealtCard.getRank() + " of " + dealtCard.getSuit());
        if(player.handTotal() > 21){
            System.out.println("Sorry " + player.getName() + "... You loose!");
        }
    }

//    public boolean checkHandAfterDeal(Player player){
//        if(player.getName() == "Dealer" && player.handTotal() < 16){
//
//        }
//    }

    public Player getWinner(){
        int highest = 0;
        Player theWinner = null;
        for(Player player : players){
            if (player.handTotal() > highest && player.handTotal() <= 21){
                //get the values of the cards dealt
                highest = player.handTotal();
                theWinner = player;
            }
        }
        //winner has the highest value!
        return theWinner;
    }
}
