// TODO add javadoc comment
public class BoardColumnsContent
{

	// TODO add javadoc comment
	private final int startIndex;

	// TODO add javadoc comment
	private final int endIndex;
	
	// TODO add javadoc comment
	private final BoardLocationState state;

	// TODO add javadoc comment
	public BoardColumnsContent(int startIndex, int endIndex, BoardLocationState state)
	{
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.state = state;
	}

	// TODO add javadoc comment
	public int getStartIndex()
	{
		return startIndex;
	}

	// TODO add javadoc comment
	public int getEndIndex()
	{
		return endIndex;
	}

	// TODO add javadoc comment
	public BoardLocationState getState()
	{
		return state;
	}

	
}
