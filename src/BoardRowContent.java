
public class BoardRowContent
{

	private BoardColumnsContent[] boardColumnsContent;

	public BoardRowContent(BoardColumnsContent[] boardColumnsContent)
	{
		this.boardColumnsContent = boardColumnsContent;
				
	}

	public int getSize()
	{
		return this.boardColumnsContent.length;
	}
	
	public BoardColumnsContent getBoardColumnsContent(int index)
	{
		return this.boardColumnsContent[index];
	}

}
