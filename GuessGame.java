/**
 * Write a description of class GuessGame here.
 *
 * @author Zheyuan Hu
 * @version 10/7/2016
 */

import java.util.Scanner;
import java.util.Arrays; 
public class GuessGame
{
    GameBasic sGame = new GameBasic();   
    Scanner typeInput = new Scanner(System.in);
    public void startGame()
    {       
             
        System.out.println("Please enter how many players are playing the game");            
        sGame.setPNum(typeInput.nextInt());        
        sGame.names = new String[sGame.getPNum()];  
        Arrays.fill(sGame.names, 0, sGame.names.length , "");
        for(int i = 0; i < sGame.getPNum(); ++i)
        {
            sGame.names = new String[sGame.getPNum()];             
            sGame.setStrPNum(Integer.toString(i + 1));              
            sGame.names[i] = ("Player " + sGame.getStrPNum());                
            System.out.println("Welcome, " + sGame.names[i]);
            System.out.println(); 
        }
    }
    
    public void playGame()
    {
        sGame.setGuessNum((int)(Math.random() * 10) + 1);
        System.out.println("Now game starts, each player please enter you answer."); 
        sGame.answer = new int[sGame.getPNum()];
        Arrays.fill(sGame.answer, 0, sGame.getPNum() , 0);
        for(int i = 0; i < sGame.getPNum(); ++i)
        {
            
                       
            sGame.setStrPNum(Integer.toString(i + 1));              
            sGame.names[i] = ("Player " + sGame.getStrPNum());    
            System.out.println(sGame.names[i] + ", what is your answer?"); 
            sGame.answer[i] = typeInput.nextInt();            
            System.out.println("Answer has been saved..."); 
            System.out.println(); 
        }
    }
    
    public void judgeGame()
    {
        sGame.absDiffer = new int[sGame.answer.length];      
        Arrays.fill(sGame.absDiffer, 0, sGame.answer.length , 0);
        sGame.correctBool = new boolean[sGame.answer.length];
        Arrays.fill(sGame.correctBool, 0, sGame.answer.length , false);
        for(int i = 0; i < sGame.answer.length; ++i)
        {
            
            sGame.absDiffer[i] = Math.abs(sGame.answer[i] - sGame.getGuessNum());
            if(sGame.absDiffer[i] == 0)
            {
                sGame.correctBool[i] = true; 
            }
            
            else
            {
                sGame.correctBool[i] = false;
            }
        }
    }
    
    public void gameResult()
    {
        for(int i = 0; i < sGame.answer.length; ++i)
        {
            if(sGame.correctBool[i] == true)
            {
                System.out.println(sGame.names[i] + ", you are the winner"); 
            }
            
            else
            {
                System.out.println(sGame.names[i] + ", you are a loser, you are just " + sGame.absDiffer[i] + " steps away from winning!");
            }
        }
    }
}
