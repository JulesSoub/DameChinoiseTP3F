public class ChineseCheckersBoardPosition
{
	private int numRow;
	private int numCol;
	
	public ChineseCheckersBoardPosition(int numRow, int numCol) throws ForbiddenPositionException
	{
		if(isForbidden(numRow, numCol))
			throw new ForbiddenPositionException();
		this.numRow = numRow;
		this.numCol = numCol;
	}

	private boolean isForbidden(int numRow, int numCol)
	{
		switch(numRow)
		{
			case 0:
				return (numCol != 4);
			case 1:
				return (numCol != 4 || numCol != 5);
			case 2:
				return (numCol != 4 || numCol != 5 || numCol != 6);
			case 3:
				return (numCol != 4 || numCol != 5 || numCol != 6 || numCol != 7);
			case 4:
				return (numCol > 12);
			case 5:
				return (numCol == 0 || numCol > 12);
			case 6:
				return (numCol < 2 || numCol > 12);
			case 7:
				return (numCol < 3 || numCol > 12);
			case 8:
				return (numCol < 4 || numCol > 12);
			case 9:
				return (numCol < 4 || numCol > 13);
			case 10:
				return (numCol < 4 || numCol > 14);
			case 11:
				return (numCol < 4 || numCol == 16);
			case 12:
				return (numCol < 4);
			case 13:
				return (numCol != 9 || numCol != 10 || numCol != 11 || numCol != 12);
			case 14:
				return (numCol != 10 || numCol != 11 || numCol != 12);
			case 15:
				return (numCol != 11 || numCol != 12);
			case 16:
				return (numCol != 12);
			default:
				return false;
		}
	}
	
	
	
	public int getNumRow()
	{
		return numRow;
	}

	public int getNumCol()
	{
		return numCol;
	}
	
	public boolean areTwoPositionsContiguous(ChineseCheckersBoardPosition position)
	{
		if(this.numRow == position.numRow && (this.numCol == position.numCol+1 || this.numCol == position.numCol-1))
			return true;
		if(this.numCol == position.numCol && (this.numRow == position.numRow+1 || this.numRow == position.numRow-1))
			return true;
		
		return false;
	}
}