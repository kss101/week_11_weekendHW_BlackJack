import org.junit.Before;
import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

import static org.junit.Assert.*;

public class GameTest {
    Game game;

    @Before

    @Test
    public void canCreateGameObject() {
        game = new Game();
        assertNotNull(game);
    }

    @Test
    public void canPlayGame(){
        game = new Game();
        game.createGame(1);
        assertEquals(2, game.countPlayers());
        assertEquals("Dealer", game.getPlayer().get(0).getName());
        assertEquals(2, game.getPlayer().get(0).getHand().size());
        assertEquals("Player_1", game.getPlayer().get(1).getName());
        assertEquals(2, game.getPlayer().get(1).getHand().size());
    }

    @Test
    public void canGetWinner(){
        game = new Game();
        game.createGame(1);
        Player winner = game.getWinner();
        System.out.println("The winner is: " + winner.getName());
    }

    @Test
    public void playerCanTwist(){
        game = new Game();
        game.createGame(1);
        Player player_1 = game.getPlayer().get(1);
        game.dealCard(player_1);
        assertEquals(3, game.getPlayer().get(1).getHand().size());
    }

    @Test
    public void dealerTwistsUnder16(){
        game = new Game();
        game.createGame(1);
        Player dealer = game.getPlayer().get(0);
        game.dealerTwistCheck(dealer);
        int finishedHandValue = dealer.handTotal();
        assertTrue(finishedHandValue >= 16);
    }
    
}
