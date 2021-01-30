import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

public class GameTest {
    Game game;

    @Test
    public void canCreateGame(){
        game = new Game();
       // game.createGame();
        System.out.println(game.createGame().getName());
    }
}
