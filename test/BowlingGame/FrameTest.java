package BowlingGame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim
 */
public class FrameTest 
{ 
  protected Frame frame;
  protected int index;
 
  @Before
  public void setUp() 
  {
    frame = new Frame();
  }

  @Test
  public void testNewFrame() 
  {
    assertEquals(0, frame.getTotalScore());
    assertEquals(0, frame.getBonus());
  }
   
  @Test
  public void testSpare() 
  {
    frame.score(5);
    frame.score(5);
    assertTrue(frame.isSpare());
  }
  
  @Test
  public void testNonSpare() 
  {
    frame.score(0);
    frame.score(0);
    assertFalse(frame.isSpare());
  }
  
  @Test
  public void testStrike() 
  {
    frame.score(10);    
    assertTrue(frame.isStrike());
  }
  
  @Test
  public void testNonStrike() 
  {
    frame.score(5);
    frame.score(5);
    assertFalse(frame.isStrike());
  }
   
  @Test
  public void testFirstScore()
  {
    frame.score(1);
    assertEquals(1, frame.getTotalScore());
    assertFalse(frame.isFinished());
  }
   
  @Test
  public void testSecondScore()
  {
    frame.score(1);
    frame.score(1);
    assertEquals(2, frame.getTotalScore());
    assertTrue(frame.isFinished());  
  }
  
  @Test
  public void testAddBonusScore()
  {
    frame.score(0);
    frame.score(0);
    frame.addBonus(5);
    assertEquals(5, frame.getTotalScore());    
  }
}
