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

}

