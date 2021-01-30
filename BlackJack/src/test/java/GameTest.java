import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

public class GameTest {
    Game game;

    @Test
    public void canCreateGame(){
        game = new Game();
        game.createGame();
        //Player dealer = game.getPlayer().get(0);
        //Player player_1 = game.getPlayer().get(1);
        //game.dealCard(player_1);
        System.out.println(game.getWinner().getName() + " wins!");
    }
}
