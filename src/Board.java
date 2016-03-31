
/**
 * this class represents a chinese checkers game board.
 * @author soubeyju
 *
 */
public class Board
{
	private static final int BOARD_SIZE = 17;
	
	// @formatter:off
	private final static BoardRowContent[] INITIAL_BOARD_CONTENT =
			new BoardRowContent[]
			{ 
				// Row 0
				new BoardRowContent
				(
						// row 0 columns content
						new BoardColumnsContent[] 
						{
								new BoardColumnsContent(0,3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4,4, BoardLocationState.RED),
								new BoardColumnsContent(5,16, BoardLocationState.FORBIDDEN),
						}
						
				),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent(),
				new BoardRowContent()
			}
			
	// @formatter:on		

	/**
	 * grid[row][col]
	 */
	private BoardLocationState[][] boardLocations; 
	
	
	
	/**
	 * Creates a new game board, in its starting configuration : Pawns are in their own camp.
	 */
	public Board()
	{
		/* 17 lignes, 121 emplacement :
		*  ligne 1: 1 emplacement
		*  2: 2
		*  3: 3
		*  4: 4
		*  5: 13
		*  6: 12
		*  7: 11
		*  8: 10
		*  9: 9
		*  10: 10
		*  11: 11
		*  12: 12
		*  13: 13
		*  
		*  
		*/
		this.boardLocations = new BoardLocationState[BOARD_SIZE][BOARD_SIZE];
		this.setAllLocationsAsForbidden();
		this.setEmptyCells();
		this.setPlayersCells();
		
	}

	private void setPlayersCells()
	{
		// Player1's cells initialization
		
	}

	private void setEmptyCells()
	{
		
	}

	private void setAllLocationsAsForbidden()
	{
		for(int rowIndex = 0 ; rowIndex < BOARD_SIZE ; rowIndex++)
			for(int columnIndex = 0 ; columnIndex < BOARD_SIZE ; columnIndex++)
				this.boardLocations[rowIndex][columnIndex] = BoardLocationState.FORBIDDEN;
	}
}
