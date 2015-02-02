package BowlingGame;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BowlingGameTest
{
  @Test
  public void testNewGame()
  {
    BowlingGame bg = new BowlingGame();    
    assertEquals(bg.getTotalScore(), 0);
  }
  
  @Test
  public void testGutterBall()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(0);
    assertEquals(bg.getTotalScore(), 0);
  }
  
  @Test
  public void testSingleBall()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(1);
    assertEquals(bg.getTotalScore(), 1);
  }
  
  @Test
  public void testTwoBalls()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(1);
    bg.score(1);
    assertEquals(bg.getTotalScore(), 2); 
  }
}
