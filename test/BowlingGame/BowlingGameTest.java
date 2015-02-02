package BowlingGame;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BowlingGameTest
{
  @Test
  public void testNewGame()
  {
    BowlingGame bg = new BowlingGame();    
    assertEquals(0, bg.getTotalScore());
  }
  
  @Test
  public void testGutterBall()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(0);
    assertEquals(0, bg.getTotalScore());
  }
  
  @Test
  public void testSingleBall()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(1);
    assertEquals(1, bg.getTotalScore());
  }
  
  @Test
  public void testTwoBalls()
  {
    BowlingGame bg = new BowlingGame();    
    bg.score(1);
    bg.score(1);
    assertEquals(2, bg.getTotalScore()); 
  }
  
  @Test
  public void testSpare()
  {
    BowlingGame bg = new BowlingGame();
    bg.score(5);
    bg.score(5);
    bg.score(5);
    assertEquals(20, bg.getTotalScore()); 
  }
}
