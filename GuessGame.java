
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
        System.out.println("Please enter how many players are playing the game");
        sGame.setPNum(typeInput.nextInt());
        for(int i = 0; i < sGame.getPNum(); ++i)
        {
            sGame.setNameArray(new String[sGame.getPNum()]);
            sGame.setStrPNum(Integer.toString(i + 1));
            sGame.setNameArray([i] )= "Player " + strPNum;
            System.out.println("Welcome, " + names[i]);
        }
    
    
    
        
        do{
            Players s = new Players();
            s.playerNumbers();
            pNumber2 = s.pNumber; 
            guessNum = (int)(Math.random()*10) + 1; 
            
            System.out.println("Game Start! A Integer between 1 - 10 has been generated, please guess!!!");
         
            for(int x = 0; x < pNumber2; ++x)
            {
                System.out.println("");
            }
            
            
            
            
            

            System.out.println("Enter end to quit or press enter to continue!");
            endWords = typeInput.nextLine(); 
        }while(!endWords.equalsIgnoreCase("end"));
    }
}
