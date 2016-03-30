
/**
 * it represents a game of chinese checkers. It's a One-on-one Game between 2 (or 
 * more, until 8 persons) persons. The object of the game is to put your pawns in the 
 * opposite camp in front of yours.
 * @author soubeyju
 */
public class ChineseCheckersGame
{

	// TODO clean comment, this tells nothing relevant
	/**
	 * Represents an object of Player type
	 */
	private Player[] players;

	// TODO clean comment, this tells nothing relevant
	/**
	 * Represents an object of Board type.
	 */
	private Board board;

	/**
	 * Creates a new Chinese checkers game, ready to be played (game board is in
	 * its starting configuration).
	 * 
	 * @param nbPlayer
	 *            The number of player who plays the game
	 */
	public ChineseCheckersGame(int nbPlayer)
	{
		this.board = new Board();
		this.players = new Player[nbPlayer];
	}

	/**
	 * Plays the game (Repetitive structure as long as ALL your pawns aren't in
	 * the opposite camp : - Movements (6 possibilities, with the possibility to
	 * jump over a pawn))
	 *
	 * current player is player 1
	 * 
	 * while <not finished> while <move is not valid> <ask current player for
	 * move> process move (compute new board state) <evaluate if game is over>
	 * current player changes
	 */
	public void play()
	{
		System.out.println("Game started");
		while (!isGameOver())
		{
			do
			{
				// <ask for current player move>;
			}
			while (!isMouvementValid());
			// process move (compute new board state);
			isGameOver();
		}
		System.out.println("Game finished");
	}

	/**
	 * @return boolean which represent the game state
	 */
	private boolean isGameOver()
	{
		return false;
	}

	/**
	 * @return boolean which allow the play operation to determine if the
	 *         movement is valid
	 */
	private boolean isMouvementValid(Mouvement move)
	{
		return false;
	}

}
