
public class BoardColumnsContent
{

	private final int startIndex;
	private final int endIndex;
	private final BoardLocationState state;

	public BoardColumnsContent(int startIndex, int endIndex, BoardLocationState state)
	{
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.state = state;
	}

	public int getStartIndex()
	{
		return startIndex;
	}

	public int getEndIndex()
	{
		return endIndex;
	}

	public BoardLocationState getState()
	{
		return state;
	}

	
}
