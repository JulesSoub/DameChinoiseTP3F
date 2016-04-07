
public class BoardRowContent
{

	private BoardColumnsContent[] boardColumnsContent;

	public BoardRowContent(BoardColumnsContent[] boardColumnsContent)
	{
		this.boardColumnsContent = boardColumnsContent;
				
	}

	public int getSize()
	{
		return boardColumnsContent.length;
	}
	
	public BoardColumnsContent getBoardColumnsContent(int index)
	{
		return boardColumnsContent[index];
	}

}
