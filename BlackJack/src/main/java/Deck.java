import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> stackOfCards;

    public Deck(){
        this.stackOfCards = new ArrayList<>();
    }

    public ArrayList<Card> getDeck() {
        return this.stackOfCards;
    }

    public void setDeck(ArrayList<Card> stackOfCards) {
        this.stackOfCards = stackOfCards;
    }

    public void createDeck(){
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        for (SuitType suit : suits){
            for(RankType rank : ranks){
               Card card = new Card( suit, rank);
                this.stackOfCards.add(card);
            }
        }
        Collections.shuffle(this.stackOfCards);
    }

    public Card dealTopCard(){
        return this.stackOfCards.remove(0);
    }

//    public void shuffleDeck(Deck deck){
//        Deck originalDeck = deck;
//        ArrayList<Card> shuffledDeck = new ArrayList<>();
//        //For the number of cards in original deck
//        for ( int numOfCards = 0; numOfCards < originalDeck.stackOfCards.size(); numOfCards++){
//            //Create a random number in that range from 1 to size of ORIGINAL deck
//            int getCard = (int)(Math.random() * originalDeck.stackOfCards.size());
//            //Get the card in ORIGINAL deck at the random num index
//            Card tempCard = originalDeck.stackOfCards.get(numOfCards);
//            originalDeck.stackOfCards. = originalDeck.stackOfCards.get(getCard);
//           Add that card to new deck
//            originalDeck.stackOfCards.add(tempCard);

//
//

//        //Repeat
//      }
//    }
}

