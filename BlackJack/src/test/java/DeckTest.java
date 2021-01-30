import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canCreateEmptyDeck(){
        int deckSize = deck.getDeck().size();
        assertEquals(0, deckSize);
    }

    @Test
    public void canCreateDeck(){
        this.deck.createDeck();
    }

    @Test
    public void canGetDeck() {
        this.deck.createDeck();
        assertEquals(52, this.deck.getDeck().size());
        //To visually see the shuffled deck of cards in the console...
//        for (Card card : this.deck.getDeck()) {
//            System.out.println(card.getRank() + " " + card.getSuit());
//        }
    }

    @Test
    public void canDealACard(){
        this.deck.createDeck();
        Card dealtCard = this.deck.dealTopCard();
        assertEquals(51, this.deck.getDeck().size());
        System.out.println("Dealt card is the " + dealtCard.getRank() + " of " + dealtCard.getSuit());
    }

}
