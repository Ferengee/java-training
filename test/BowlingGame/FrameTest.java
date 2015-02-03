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
  public void testFirstRoll() throws Exception
  {
    frame.score(1);
    assertEquals(1, frame.getTotalScore());
    assertFalse(frame.isClosed());
    assertFalse(frame.isSpare());
    assertFalse(frame.isStrike());
  }
   
  @Test
  public void testSecondRoll() throws Exception
  {
    frame.score(1);
    frame.score(1);
    assertEquals(2, frame.getTotalScore());
    assertTrue(frame.isClosed());  
    assertFalse(frame.isSpare());
    assertFalse(frame.isStrike());
  }
  
  @Test
  public void testAddBonusScore() throws Exception
  {
    frame.score(0);
    frame.score(0);
    frame.addBonus(5);
    assertEquals(5, frame.getTotalScore());    
  }
   
  @Test
  public void testSpare() throws Exception 
  {
    frame.score(5);
    frame.score(5);
    assertTrue(frame.isSpare());
  }
 
  @Test
  public void testStrike() throws Exception 
  {
    frame.score(10);    
    assertTrue(frame.isStrike());
    assertTrue(frame.isClosed());
  }
  
  @Test(expected=Exception.class)
  public void testScoreOnClosedFrame() throws Exception
  {
    frame.score(1);
    frame.score(1);
    frame.score(1);
  }
}
