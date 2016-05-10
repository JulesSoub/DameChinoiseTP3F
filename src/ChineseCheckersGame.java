
/**
 * it represents a game of chinese checkers. It's a One-on-one Game between 2 (or 
 * more, until 8 persons) persons. The object of the game is to put your pawns in the 
 * opposite camp in front of yours.
 * @author soubeyju
 */
public class ChineseCheckersGame
{

	/**
	 * All players on the Chinese Checkers Game
	 */
	private Player[] players;

	/**
	 * The game board.
	 */
	private Board board;

	/**
	 * Creates a new Chinese checkers game, ready to be played (game board is in
	 * its starting configuration).
	 * 
	 * @param nbPlayer
	 *            The number of player who plays the game
	 */
	// TODO rename parameter
	public ChineseCheckersGame(int nbPlayer)
	{
		this.board = new Board();
		this.players = new Player[nbPlayer];
	}
    // @formatter:off
	/**
	 * Plays the game (Repetitive structure as long as ALL your pawns aren't in
	 * the opposite camp : - Movements (6 possibilities, with the possibility to
	 * jump over a pawn))
	 *
	 * current player is player 1
	 * 
	 * while <not game is over>
	 * 	do 
	 *  	<ask current player for move>
	 *  while <move is not valid> 
	 *  <process move> (compute new board state) 
	 * 	current player changes
	 */
    // @formatter:on
	public void play()
	{
		int currentPlayerNumber = 0;
		
		System.out.println("Game started");
		
		System.out.println(new Board().toString());
		
		while(!this.isGameOver())
		{
			Mouvement mouvement = null;
			do
			{
				mouvement = currentPlayer.askForMove();
			}
			while(!this.board.isMouvementValid(mouvement));
			
			this.board.processMove(mouvement);
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
	 * @return players the array list which contain all players
	 */
	public Player[] getPlayers()
	{
		return players;
	}

}
