import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class BowlingTest
{
  @Test
  public void testCreateGame()
  {
    BowlingGame bg = new BowlingGame();
    bg.score(0);
    assertEquals(bg.getTotalScore(), 0);


// begin op score 0    
// begin met 0 worpen
  }
}
