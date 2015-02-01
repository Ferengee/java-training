package BowlingGame;

public class BowlingGame
{
  protected int score = 0;
  
  public void score(int score)
  {
    this.score = score;
  }

  public int getTotalScore()
  {
    return score;
  }
}
