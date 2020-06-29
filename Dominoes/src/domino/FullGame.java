/* Train Dominoes
	by Andrew Hochstetler, 2020.

	FullGame.java
	Represents a full game.  Holds the current state of the game which includes:
	-Access to the current round being played
	-
*/

package domino;

import java.util.LinkedList;
import domino.Player;
import domino.GameRound;

public class FullGame {
	
	private int numPlayers = 0;
	private LinkedList<Player> playerList;
	
	
	public FullGame(){}; 
	
	public void startGame(int numPlayers) {
		this.numPlayers = numPlayers;
		playerList = new LinkedList<Player>();
		// Add all human players.  Create an object for each.
		for (int x = 0; x < numPlayers; x++) {
			playerList.add(new Player(true));
		}
		// Add a new round t
	}
}