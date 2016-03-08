// TODO (DONE) update comment (find a link to a description of the game in english)
/**
 * it represents a game of chinese checkers. It's a One-on-one Game between 2 (or 
 * more, until 8 persons) persons. The object of the game is to put your pawns in the 
 * opposite camp in front of yours.
 * @author soubeyju
 */
public class ChineseCheckersGame
{
	private Board board;

	// TODO (DONE) write ChineseCheckersGame()
	/**
	 * Creates a new Chinese checkers game, ready to be played (game board is in its 
	 * starting configuration).
	 */
	public ChineseCheckersGame()
	{
		this.board = new Board();
	}
	
	// TODO (DONE) rename this method (ask for advice)
	// TODO (DONE) update comment (what is the main algorithm?)
	/**
	 * Plays the game (Repetitive structure as long as ALL your pawns aren't in the opposite 
	 * camp :
	 * 		- Movements (6 possibilities, with the possibility to jump over a pawn))
	 * 
	 * While(pawn aren't in the opposite camp)
	 * 	{
	 * 		If (it's your turn)
	 * 			moveYourPawn();
	 * 		Else 
	 * 		 	moveOpponentPawn();
	 *  }
	 */
	public void play()
	{
		System.out.println("Game started");
		System.out.println("Game finished");
	}
	
}     
