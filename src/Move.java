// TODO (DONE)rename this class (Move)
/**
 * All the possible movements of a pawn on the game board.
 *  
 * @author soubeyju
 *
 */
public class Move
{
	private Position[] positions;
	
	/**
	 * Create a new move of a pawn which is possible.
	 */
	public Move(Position[] positions)
	{
		this.positions = positions;
	}
	
	public int getPositionsLength()
	{
		return this.positions.length;
	}
	
	public Position getStartPosition()
	{
		return this.positions[0];
	}
	
	public Position getEndPosition()
	{
		return this.positions[this.positions.length-1];
	}
	
	//public static suite
}
