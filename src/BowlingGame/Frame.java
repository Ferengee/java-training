package BowlingGame;

public class Frame 
{
  /** Max score (without bonus) that can be scored in one Frame */
  final int MAX_SCORE = 10;
  
  /** Bonus points, when this Frame is a Strike or Spare */
  protected int bonus = 0;
  
  protected int currentRoll = 0;

  protected int[] scores = new int[2];
  
  public int getScore()
  {
    int score = 0;
    for (int i=0; i < currentRoll; i++)
    {
      score += scores[i];
    }
    return score;
  }
  
  public int getTotalScore()
  {
    return this.getScore() + this.bonus;
  }

  public void score(int pins) throws Exception 
  {
    if (this.isClosed())
      throw new Exception("Cannot score on a closed frame");
    
    scores[currentRoll] = pins;
    currentRoll++;
  }

  public boolean isSpare() 
  {
    return (this.getScore() == MAX_SCORE && this.scores[0] != MAX_SCORE);    
  }
  
  public boolean isStrike()
  {
    return this.scores[0] == MAX_SCORE;  
  }
  
  public boolean isFirstRoll()
  {
    return this.currentRoll == 0;
  }
  
  public boolean isSecondRoll()
  {
    return this.currentRoll == 1;
  }

  boolean isClosed() 
  {
    return currentRoll >= 2 || this.isStrike();
  }

  public int getBonus() 
  {
    return bonus;
  }
  
  public void addBonus(int bonus)
  {
    this.bonus += bonus;
  }
}
