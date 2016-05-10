import java.util.Scanner;

// TODO (DONE) rename this class (PlayerInput)
/**
 * The players who play the Chinese Checkers Game.
 * @author soubeyju
 *
 */
public class PlayerInput
{
	// TODO add javadoc comment
	public Move askForMove()
	{
		String[] strArray;
		Scanner playerInputMove = new Scanner(System.in);
		
		System.out.println("Deplacement : ");
		strArray = playerInputMove.nextLine().split(" ");
		
		for(int strIndex = 0 ; strIndex < strArray.length ; strIndex++)
		{
			
		}
		
		return new Move();
	}
}
