import org.apache.commons.lang3.StringUtils;


/**
 * this class represents a chinese checkers game board.
 * @author soubeyju
 *
 */
public class Board
{
	// TODO add javadoc comment
	private static final int BOARD_SIZE = 17;

	// TODO add javadoc comment
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
								new BoardColumnsContent(5,16, BoardLocationState.FORBIDDEN)
						}
						
				),
				// Row 1
				new BoardRowContent
				(
						// row 1 columns content
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 5, BoardLocationState.RED),
								new BoardColumnsContent(6, 16, BoardLocationState.FORBIDDEN)
						}
				),
				// Row 2
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 6, BoardLocationState.RED),
								new BoardColumnsContent(7, 16, BoardLocationState.FORBIDDEN)
						}
				),
				//Row 3
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 7, BoardLocationState.RED),
								new BoardColumnsContent(8, 16, BoardLocationState.FORBIDDEN)
						}
				),
				// Row 4
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 3, BoardLocationState.WHITE),
								new BoardColumnsContent(4, 8, BoardLocationState.EMPTY),
								new BoardColumnsContent(9, 12, BoardLocationState.YELLOW),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
						}
				),
				//Row 5
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 0, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(1, 3, BoardLocationState.WHITE),
								new BoardColumnsContent(4, 9, BoardLocationState.EMPTY),
								new BoardColumnsContent(10, 12, BoardLocationState.YELLOW),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
						}
				),
				// Row 6
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 1, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(2, 3, BoardLocationState.WHITE),
								new BoardColumnsContent(4, 10, BoardLocationState.EMPTY),
								new BoardColumnsContent(11, 12, BoardLocationState.YELLOW),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
						}
				),
				// Row 7
				new BoardRowContent
				(
						new BoardColumnsContent[]
						{
								new BoardColumnsContent(0, 2, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(3, 3, BoardLocationState.WHITE),
								new BoardColumnsContent(4, 11, BoardLocationState.EMPTY),
								new BoardColumnsContent(12, 12, BoardLocationState.YELLOW),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
						}
				),
				// Row 8
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 12, BoardLocationState.EMPTY),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 9
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 4, BoardLocationState.BLUE),
								new BoardColumnsContent(5, 12, BoardLocationState.EMPTY),
								new BoardColumnsContent(13, 13, BoardLocationState.GREEN),
								new BoardColumnsContent(14, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 10
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 5, BoardLocationState.BLUE),
								new BoardColumnsContent(6, 12, BoardLocationState.EMPTY),
								new BoardColumnsContent(13, 14, BoardLocationState.GREEN),
								new BoardColumnsContent(15, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 11
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 6, BoardLocationState.BLUE),
								new BoardColumnsContent(7, 12, BoardLocationState.EMPTY),
								new BoardColumnsContent(13, 15, BoardLocationState.GREEN),
								new BoardColumnsContent(16, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 12
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 3, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(4, 7, BoardLocationState.BLUE),
								new BoardColumnsContent(8, 12, BoardLocationState.EMPTY),
								new BoardColumnsContent(13, 16, BoardLocationState.GREEN)
							}
				),
				// Row 13
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 8, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(9, 12, BoardLocationState.BLACK),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 14
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 9, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(10, 12, BoardLocationState.BLACK),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 15
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 10, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(11, 12, BoardLocationState.BLACK),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
							}
				),
				// Row 16
				new BoardRowContent
				(
						new BoardColumnsContent[]
							{
								new BoardColumnsContent(0, 11, BoardLocationState.FORBIDDEN),
								new BoardColumnsContent(12, 12, BoardLocationState.BLACK),
								new BoardColumnsContent(13, 16, BoardLocationState.FORBIDDEN)
							}
				)
			};
	
	// TODO add javadoc comment
	private final static int[] SPACES_ON_ROW = {12,11,10,9,0,1,2,3,4,3,2,1,0,9,10,11,12};
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
		this.boardLocations = new BoardLocationState[BOARD_SIZE][BOARD_SIZE];
		
		for(int boardRowIndex = 0 ; boardRowIndex < BOARD_SIZE ; boardRowIndex++)
		{
			BoardRowContent currentRowContent = INITIAL_BOARD_CONTENT[boardRowIndex];
			for(int boardColumnsIndex = 0 ; boardColumnsIndex < currentRowContent.getSize() ; boardColumnsIndex++)
			{
				BoardColumnsContent currentColumnsContent = currentRowContent.getBoardColumnsContent(boardColumnsIndex);
				for(int columnIndex = currentColumnsContent.getStartIndex() ; columnIndex <= currentColumnsContent.getEndIndex() ; columnIndex++)
				{
					this.boardLocations[boardRowIndex][columnIndex] = currentColumnsContent.getState();
				}
			}
		}
	}
	
	// TODO finish writing javadoc comment
	/**
	 * @return boolean which allow the play operation to determine if the
	 *         movement is valid
	 */
	public boolean isMouvementValid(Move mouvement)
	{
		if(this.boardLocations[mouvement.getStartPosition().getNumRow()][mouvement.getStartPosition().getNumCol()] != BoardLocationState.RED)
			return false;
			
		return true;
	}
	
	@Override
	public String toString()
	{
		String strBoard = "";
		
		for(int rowIndex = 0 ; rowIndex < BOARD_SIZE ; rowIndex++)
		{
			
			strBoard += StringUtils.repeat(' ', this.SPACES_ON_ROW[rowIndex]);
			
			for(int colIndex = 0 ; colIndex < BOARD_SIZE ; colIndex++)
				strBoard += this.boardLocations[rowIndex][colIndex].toString();
			
			strBoard += "\n";
		}
		return strBoard;
	}

	// TODO add javadoc comment
	public void processMove(Move mouvement)
	{
		// TODO Auto-generated method stub
		
	}
}