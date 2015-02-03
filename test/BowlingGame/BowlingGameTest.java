package BowlingGame;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest
{
  BowlingGame bg;
  
  @Before
  public void setUp() 
  {
    bg = BowlingGame.startDefaultGame();
  }
  
  @Test
  public void testNewGame()
  {
    assertEquals(0, bg.getTotalScore());
  }
  
  @Test
  public void testGutterBall()
  {
    bg.score(0);
    assertEquals(0, bg.getTotalScore());
  }
  
  @Test
  public void testSingleBall()
  {
    bg.score(1);
    assertEquals(1, bg.getTotalScore());
  }
  
  @Test
  public void testTwoBalls()
  {
    bg.score(1);
    bg.score(1);
    assertEquals(2, bg.getTotalScore()); 
  }
  
  @Test
  public void testSpare()
  {
    bg.score(5);
    bg.score(5);
    bg.score(5);
    assertEquals(20, bg.getTotalScore()); 
  }
}
