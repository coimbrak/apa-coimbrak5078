//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
  private int speed;

  public Ammo()
  {
    this(0,0,5);
  }

  public Ammo(int x, int y)
  {
	super(x,y);
	speed = 1;
    //add code
  }

  public Ammo(int x, int y, int s)
  {
	super(x,y);
	speed = s;
    //add code
  }

  public void setSpeed(int s)
  {
	speed = s;
    //add code
  }

  public int getSpeed()
  {
    return speed;
  }

  public void draw( Graphics window )
  {
    window.setColor(Color.YELLOW);
    window.fillRect(getX(), getY(), getWidth(), getHeight());

    //add code to draw the ammo
  }

/*
  public int getX()
  {
    return super.getX();
  }

  public int getY()
  {
    return super.getY();
  }

  public int getWidth()
  {
    return super.getWidth();
  }

  public int getHeight()
  {
    return super.getHeight();
  }
*/

  public void move( String direction )
  {
	if(direction.equals("SHOOT"))
		setY(getY() - speed);

    //add code to draw the ammo
  }

  public String toString()
  {
    return this.toString() + " " + speed;
  }
}
