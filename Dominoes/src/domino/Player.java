/* Train Dominoes
	by Andrew Hochstetler, 2020.

	Player.java
	Represents an individual player.  Players get scores assigned when rounds are over.
*/

package domino;

public class Player {

	private int[] score = new int[13];					// Score in each round.
	private boolean[] complete = new boolean[13];		// Mark round complete.  May want later so I'm implementing it now.

	// For use in AI implementation.
	private boolean isHuman;

	public Player(boolean isHuman) {
		this.isHuman = isHuman;
		for(int x = 0; x < 13; x++) {
			score[x] = 0;
			complete[x] = false;
		}
	}
	
	public int getScore() {
		int retval = 0;
		for(int x : score)
			retval = retval + x;
		return retval;
	}
	
	public int addScore(int round, int total) {
		complete[round] = true;
		score[round] = total;
		return this.getScore();
	}
}