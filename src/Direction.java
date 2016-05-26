public enum Direction
{
	RIGHT(0, 1),
	LEFT(0, -1),
	UP_RIGHT(-1, 0),
	UP_LEFT(-1, -1),
	DOWN_RIGHT(1, 1),
	DOWN_LEFT(1, 0);
	
	int deltaRow, deltaCol;
	
	private Direction(int deltaRow, int deltaCol)
	{
		this.deltaRow = deltaRow;
		this.deltaCol = deltaCol;
	}
}
