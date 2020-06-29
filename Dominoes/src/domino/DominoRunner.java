package domino;

import domino.Domino;
import domino.InputScanner;
import domino.FullGame;
import java.io.Console;

public class DominoRunner{
	
	public static void main(String[] args)
	{
		/*
		Domino d = new Domino(8,9);
		System.out.println(d.toString());
		d = new Domino(11,9);
		System.out.println(d.toString());
		d = new Domino(11,11);
		System.out.println(d.toString());
		d = new Domino(9,11);
		System.out.println(d.toString());
		
		
		Player p = new Player(true);
		System.out.println(p.addScore(0, 55));
		System.out.println(p.addScore(1, 34));
		System.out.println(p.addScore(12, 39));
		System.out.println(p.getScore());
		*/
		
		Console userIn = System.console();
		FullGame fg;		// FullGame object
		int p;				// Num players
		String temp;		// Temp string
		
		// Launch game -> Welcome lines.  Confim you would like to play.  Yes >> Start loop
		System.out.println("Welcome to Train Dominoes v.01\nWould you like to play a game? (Y/N): ");
		char ch = userIn.readLine().charAt(0);
		if (ch == 'Y') {
		// Loop asks how many players, creates a new FullGame object sending just the number of players.
		// Entire game is encapsulated in that FullGame object.  We ask here with a line like:
		// FullGame fg = new FullGame(numPlayers);
		// fg.start();
			while (ch == 'Y') {
				p = 0;
				while (p < 2 || p > 4) {
					System.out.println("How many players? (2-4): ");
					temp = userIn.readLine();
					if ((temp.length() == 1) && ((int)temp.charAt(0) >= 50) && ((int)temp.charAt(0) <= 52))
						p = Integer.parseInt(temp);
				}
				fg = new FullGame();
				fg.startGame(p);
				System.out.println("Thank you for playing.  Would you like to play again? (Y/N): ");
				ch = userIn.readLine().charAt(0);
			}
		}	
		else if (ch == 'N')
			System.out.println("Nope.");
		else
			System.out.println("Invalid input.");

		// Yes >> jump back to FullGame fg.
		// No >> quit.
	}
	
}