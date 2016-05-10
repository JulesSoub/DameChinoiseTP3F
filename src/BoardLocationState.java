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
	
	// TODO add javadoc comment
	private final String strState;
	
	// TODO add javadoc comment
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
