
import bowling.SinglePlayerGame;
import com.mycompany.mavenproject1.MultiplayerGame;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class MultiplayerGameTest {
    
    private MultiplayerGame game;
    
    
    
        @Before
	public void setUp() {
		game = new MultiplayerGame();
	}
        @Test
        public void testStarGame(){
            String[] playerName = {"Max","gui","mat"};
            assertEquals(game.startNewGame(playerName),"Prochain tir : Max, tour n°1, boule n°1");
                
        }
        @Test(expected = ExcepetionPasDeJoueur.class)
        public void testStarGame() throws ExceptionPasDeJoueur {
            String [] playerName = {};
            game.startNewGame(playerName);
        }
        
        
        
        
        
        
        }

