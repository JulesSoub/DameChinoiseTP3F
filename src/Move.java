import java.util.List;

// TODO (DONE)rename this class (Move)
/**
 * All the possible movements of a pawn on the game board.
 *  
 * @author soubeyju
 *
 */
public class Move
{
	private List<Position> positions;
	
	/**
	 * Create a new move of a pawn which is possible.
	 */
	public Move(List<Position> positions)
	{
		this.positions = positions;
	}
	
	public int getPositionsLength()
	{
		return this.positions.size();
	}
	
	public Position getStartPosition()
	{
		return this.positions.get(0);
	}
	
	public Position getEndPosition()
	{
		return this.positions.get(this.positions.size()-1);
	}
	
	//public static suite
}
