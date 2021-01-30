import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player player;

    @Test
    public void canCreatePlayer(){
        player = new Player("Player 1");
        assertNotNull(player);
    }

    @Test
    public void canGetPlayerName(){
        player = new Player("Player 1");
        assertTrue(player.getName() == "Player 1");
    }

    @Test
    public void canGetPlayerHand(){
        player = new Player("Player 1");
        assertEquals(0, player.getHand().size());
    }
}
