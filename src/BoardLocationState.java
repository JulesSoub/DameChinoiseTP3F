/**
 * All the diferents parts of the board : Forbidden Area, Game Area (player1's pawn, player2's pawn, ...)
 * 
 * @author soubeyju
 *
 */
public enum BoardLocationState
{
	FORBIDDEN(""),
	EMPTY(" ."),
	RED(" R"),
	YELLOW(" J"),
	GREEN(" V"),
	BLUE(" B"),
	BLACK(" N"),
	WHITE(" W");
	
	private final String strState;
	
	private BoardLocationState(String strState)
	{
		this.strState = strState;
	}

	@Override
	public String toString()
	{
		return this.strState;
	}
	
	
}
