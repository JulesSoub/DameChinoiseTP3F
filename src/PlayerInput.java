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
		List<Position> positions = new ArrayList<Position>();
				
		String[] strArray;
		
		System.out.println("Deplacement : ");
		strArray = playerInputMove.nextLine().split(" ");
		
		for(int strIndex = 0 ; strIndex < strArray.length ; strIndex++)
		{
			String[] strArraySplit;
			strArraySplit = strArray[strIndex].split("-");
			
			positions.add(new Position(Integer.parseInt(strArraySplit[0]), Integer.parseInt(strArraySplit[1])));
		}
		
		return new Move(positions);
	}
}
