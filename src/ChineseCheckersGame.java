
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
	private PlayerInput[] players;

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
		this.players = new PlayerInput[nbPlayer];
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
		
		this.players[0] = new PlayerInput(BoardLocationState.RED);
		this.players[1] = new PlayerInput(BoardLocationState.BLACK);	
		if(this.players.length == 4)
		{
			this.players[2] = new PlayerInput(BoardLocationState.WHITE);
			this.players[3] = new PlayerInput(BoardLocationState.GREEN);
			if(this.players.length == 6)
			{
				this.players[4] = new PlayerInput(BoardLocationState.BLUE);
				this.players[5] = new PlayerInput(BoardLocationState.YELLOW);
			}
		}
		
		System.out.println("Game started");
		
		System.out.println(this.board.toString());
		
		while(!this.isGameOver())
		{
			Move mouvement = null;
			do
			{
				mouvement = this.players[currentPlayerNumber].askForMove();
			}
			while(mouvement == null || !this.board.isMouvementValid(mouvement));
			
			this.board.processMove(mouvement);
			System.out.println(this.board.toString());
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
	public PlayerInput[] getPlayers()
	{
		return players;
	}

}
