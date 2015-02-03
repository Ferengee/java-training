package BowlingGame;

public class Frame 
{
  protected int[] scores = new int[2];
  protected int scoreIndex = 0;
  protected int bonus = 0;
  protected int maxScore = 10;
  
  public int getScore()
  {
    int score = 0;
    for (int i=0; i < scoreIndex; i++)
    {
      score += scores[i];
    }
    return score;
  }
  
  public int getTotalScore()
  {
    return this.getScore() + this.bonus;
  }

  void score(int score) 
  {
    scores[scoreIndex] = score;
    scoreIndex++;
  }

  public boolean isSpare() 
  {
    return (this.getScore() == maxScore && this.scores[0] != maxScore);    
  }
  
  public boolean isStrike()
  {
    return this.scores[0] == maxScore;  
  }
  
  public int getScoreIndex()
  {
    return scoreIndex;
  }

  boolean isFinished() 
  {
    return scoreIndex >= 2;
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
