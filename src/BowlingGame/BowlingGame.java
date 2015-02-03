package BowlingGame;

import java.util.ArrayList;

public class BowlingGame
{
  protected int currentFrameIndex = 0;  
  protected ArrayList<Frame> frames = new ArrayList();
  
  /**
   * Static factory method to create a game with 10 frames
   * @return 
   */
  public static BowlingGame startDefaultGame()
  {
    int defaultNrOfFrames = 10;
    ArrayList<Frame> frames = new ArrayList();
    for(int frameIndex=0;frameIndex < defaultNrOfFrames; frameIndex++)
    {
      frames.add(new Frame());
    }
    return new BowlingGame(frames);
  }

  public BowlingGame(ArrayList<Frame> frames)
  {
    this.frames = frames;    
  }
  
  public void score(int pins)
  {
    this.calculateBonus(pins);
    
    Frame currentFrame = this.getCurrentFrame();       
    currentFrame.score(pins);
    
    if (currentFrame.isFinished())
    {
      currentFrameIndex++;
    }
  }
  
  public void calculateBonus(int pins)
  {
    Frame currentFrame = this.getCurrentFrame();
    if (currentFrameIndex > 0)
    {
      Frame previousFrame = this.getPreviousFrame();       
      if (previousFrame.isStrike())
      {
        previousFrame.addBonus(pins);
      }
      else if (previousFrame.isSpare() && currentFrame.getScoreIndex() == 0)
      {
        previousFrame.addBonus(pins);
      }
    }
  }
  
  public int getTotalScore()
  {
    int score = 0;
    for (int i = 0; i <= currentFrameIndex; i++)      
    {
      Frame frame = frames.get(i);
      score += frame.getTotalScore();
    }
    return score;
  }
  
  public Frame getCurrentFrame()
  {
    return frames.get(currentFrameIndex);
  }
  
  public Frame getPreviousFrame()
  {
    return frames.get(currentFrameIndex - 1);
  }
}
