/**
 * Write a description of class GuessGame here.
 *
 * @author Zheyuan Hu
 * @version 10/7/2016
 */

import java.util.Scanner;

public class GuessGame
{
    public void startGame()
    {
        String endWords;
        Scanner typeInput = new Scanner(System.in);

        GameBasic sGame = new GameBasic();
        do{
            System.out.println("Please enter how many players are playing the game");
        
            sGame.setPNum(typeInput.nextInt());
        
            for(int i = 0; i < sGame.getPNum(); ++i)
            {
                sGame.names = new String[sGame.getPNum()];
                
                sGame.setStrPNum(Integer.toString(i + 1));
                
                sGame.names[i] = ("Player " + sGame.getStrPNum());
                
                System.out.println("Welcome, " + sGame.names[i]);
            }
            typeInput.nextLine();
            System.out.println("Enter end to quit or press enter to continue!");
            endWords = typeInput.nextLine();
        }while(!endWords.equalsIgnoreCase("end"));
    }
}
