
/**
 * Launcher for the game. 
 * 
 * @author Zheyuan Hu 
 * @version 10/7/2016 
 */

import java.util.Scanner;

public class GameLauncher
{
   public static void main(String[] args)
   {
       String endWords;
       
       Scanner typeInput = new Scanner(System.in);
       GuessGame game = new GuessGame(); 
       
       do{
           game.startGame(); 
           game.playGame();
           game.judgeGame();
           game.gameResult();
           
           System.out.println("Enter end to quit or press enter to continue!");
           endWords = typeInput.nextLine();
       }while(!endWords.equalsIgnoreCase("end"));
   }  // end of main 
}
