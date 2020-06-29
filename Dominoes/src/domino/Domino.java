/* Train Dominoes
	by Andrew Hochstetler, 2020.

	Domino.java
	Class to hold an individual game piece.  Provides toString() functionality as well, displaying a
	standardized "[ xx | xx ]" view so that other displays line up evenly. 
*/

package domino;

public class Domino {
	
 	private Integer left;
	private Integer right;
	
	public Domino(int left, int right) {
		this.left = new Integer(left);
		this.right = new Integer(right);
	}
	
	public int getLeft() {
		return left.intValue();
	}
	
	public int getRight() {
		return right.intValue();
	}
	
	public boolean isDoubles() {
		if (left == right)
			return true;
		return false;
	}
	
	public int getHigh() {
		if (left > right)
			return left.intValue();
		else 
			return right.intValue();
	}
	
	public int getLow() {
		if (left < right)
			return left.intValue();
		else
			return right.intValue();
	}
	
	@Override
	public String toString() {
		String retval = new String("[");
		String ccat;
		if (left.intValue() < 10)
			ccat = new String("  " + left.toString() + " - ");
		else
			ccat = new String(" " + left.toString() + " - ");
		retval = retval.concat(ccat);
		if (right.intValue() < 10)
			ccat = new String(right.toString() + "  ]");
		else
			ccat = new String(right.toString() + " ]");
		return retval.concat(ccat);
	}
}