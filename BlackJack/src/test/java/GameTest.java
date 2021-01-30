import org.junit.Before;
import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        game.createGame();
        Player winner = game.getWinner();
        System.out.println("The winner is: " + winner.getName());
        assertEquals(2, game.countPlayers());
        assertEquals("Dealer", game.getPlayer().get(0).getName());
        assertEquals(2, game.getPlayer().get(0).getHand().size());
        assertEquals("Player_1", game.getPlayer().get(1).getName());
        assertEquals(2, game.getPlayer().get(1).getHand().size());
        assertNotNull(winner.getName());
    }

    @Test
    public void playerCanTwist(){
        game = new Game();
        game.createGame();
        Player player_1 = game.getPlayer().get(1);
        game.dealCard(player_1);
        assertEquals(3, game.getPlayer().get(1).getHand().size());
    }
}
