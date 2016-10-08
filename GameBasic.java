
/**
 * Write a description of class GameBasic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBasic
{
    private int guessNum; 
    private int pNum; 
    
    private String strPNum; 
    private String[] names; 
    private String chooseNum;
    
    public void setGuessNum(int newGuessNum)
    {
        guessNum = newGuessNum; 
    }
    public int getGuessNumber()
    {
      return guessNum;
    }
    
    public void setPNum(int newPNum)
    {
        pNum = newPNum; 
    }
    public int getPNum()
    {
      return pNum;
    }
    
    public void setStrPNum(String newStrPNum)
    {
      strPNum = newStrPNum;
    }
    public String getSpecies()
    {
      return strPNum;
    }
    
    public void setChooseNum(String newChooseNum)
    {
      chooseNum = newChooseNum;
    }
    public String getChooseNum()
    {
      return chooseNum;
    }
    
    public void setNameArray(String[] newNameArray)
    {
      names = newNameArray;
    }
}
