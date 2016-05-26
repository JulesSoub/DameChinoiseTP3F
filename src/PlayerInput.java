import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO (DONE) rename this class (PlayerInput)
/**
 * The players who play the Chinese Checkers Game.
 * @author soubeyju
 *
 */
public class PlayerInput
{
	private final BoardLocationState pawnColor;
	
	Scanner playerInputMove = new Scanner(System.in);
	
	public PlayerInput(BoardLocationState pawnColor)
	{
		this.pawnColor = pawnColor;
	}
	// TODO add javadoc comment
	public Move askForMove()
	{
		List<ChineseCheckersBoardPosition> positions = new ArrayList<ChineseCheckersBoardPosition>();
				
		String[] strArray;
		
		System.out.println("Deplacement : ");
		strArray = playerInputMove.nextLine().split(" ");
		
		for(int strIndex = 0 ; strIndex < strArray.length ; strIndex++)
		{
			String[] strArraySplit;
			strArraySplit = strArray[strIndex].split("-");
			
			try
			{
				positions.add(new ChineseCheckersBoardPosition(Integer.parseInt(strArraySplit[0]), Integer.parseInt(strArraySplit[1])));
			}
			catch (Exception e)
			{
				System.out.println("Mouvement invalide !");
				return null;
			}
		}
		
		return new Move(positions);
	}
}
