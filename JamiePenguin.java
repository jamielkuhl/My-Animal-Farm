import java.awt.Color; 

public class JamiePenguin extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public JamiePenguin(World wref)
  {
    super(wref);
    Color shellColor = new Color(2, 132, 130);
    this.setShellColor(shellColor);
    Color bodyColor = new Color(2, 132, 130);
    this.setBodyColor(bodyColor);
    this.setWidth(15);
    this.setHeight(23);
 
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public JamiePenguin(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}
  