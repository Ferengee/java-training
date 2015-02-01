package BowlingGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTest
{
  @Test
  public void testCreateGame()
  {
    BowlingGame bg = new BowlingGame();
    bg.score(0);
    assertEquals(bg.getTotalScore(), 1);


// begin op score 0    
// begin met 0 worpen
  }
}
