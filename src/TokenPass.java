import java.util.Random;

public class TokenPass {
	private int[] board;
	private int currentPlayer;

	public static void main(String[] args) {
		int playerCount = 3;
		TokenPass tp = new TokenPass(playerCount);
		tp.distributeCurrentPlayerTokens(playerCount);
	}

	/**
	 * Creates the board array to be of size playerCount and fills it with random integer values from 1 to 10,
	 * inclusive. Initializes currentPlayer to a random integer value in the range between 0 and playerCount-1,
	 * inclusive.
	 * 
	 * @param playerCount
	 *            the number of players
	 */
	public TokenPass(int playerCount) { /* to be implemented in part (a) */
		board = new int[playerCount];
		boolean zero = true;
		for (int i = 0; i < playerCount; i++) {
			while (zero == true) {
				board[i] = new Random().nextInt(11);
				if (board[i] != 0) {
					zero = false;
				}
			}
			zero = true;
		}
		printBoard(3);
		System.out.println("\n");
	}

	public void printBoard(int playerCount) {
		for (int i : board) {
			System.out.println(i);
		}
	}

	/**
	 * Distributes the tokens from the current player's position one at a time to each player in the game. Distribution
	 * begins with the next position and continues until all the tokens have been distributed. If there are still tokens
	 * to distribute when the player at the highest position is reached, the next token will be distributed to the
	 * player at position 0. Precondition: the current player has at least one token. Postcondition: the current player
	 * has not changed.
	 */
	public void distributeCurrentPlayerTokens(int playerCount) {
		currentPlayer = new Random().nextInt(playerCount);
		System.out.println("(" + currentPlayer + ")");
		boolean first = true;
		for (int i = 0; i < board.length; i++) {
			// System.out.println("1");
			if (first == true) {
				// System.out.println("1.5");
				i = currentPlayer;
				if (i == board.length - 1) {
					i = -1;
				}
				first = false;
			} else {
				if (board[currentPlayer] != 0 && currentPlayer != i) {
					// System.out.println("2");
					board[i]++;
					board[currentPlayer]--;
					if (i == board.length - 1) {
						// System.out.println("3");
						i = -1;
					}
				}
			}
			// System.out.println("4");
		}
		printBoard(3);
		System.out.println("\n");
	}
	// There may be instance variables, constructors, and methods that are not shown.
}
