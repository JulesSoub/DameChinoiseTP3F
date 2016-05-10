// TODO add javadoc comment
public class BoardRowContent
{

	// TODO add javadoc comment
	private BoardColumnsContent[] boardColumnsContent;

	// TODO add javadoc comment
	public BoardRowContent(BoardColumnsContent[] boardColumnsContent)
	{
		this.boardColumnsContent = boardColumnsContent;
				
	}

	// TODO add javadoc comment
	public int getSize()
	{
		return this.boardColumnsContent.length;
	}
	
	// TODO add javadoc comment
	public BoardColumnsContent getBoardColumnsContent(int index)
	{
		return this.boardColumnsContent[index];
	}

}
