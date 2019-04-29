import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block
{

  public Wall()
  {
	super();
  }


  public Wall(int x, int y)
  {
	super(x,y);
  }

  public Wall(int x, int y, int w, int h, Color c)
  {
	super(x,y,w,h,c);
  }

  public String toString()
  {
        return super.toString();
  }

}
	
