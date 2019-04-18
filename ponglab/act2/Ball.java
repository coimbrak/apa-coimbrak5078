//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  private int xSpeed;
  private int ySpeed;

  public Ball()
  {
    super(200,200);
    xSpeed = 3;
    ySpeed = 1;
  }

  //add the other Ball constructors
        


public Ball(int x, int y)
{
  super(x,y);
  setX(x);
  setY(y);
}
        
     
public void setX(int x)
{
  xSpeed = x;
}

public void setY(int y)
{
  ySpeed = y;
}
           
             
           
  //add the set methods
   

  public void moveAndDraw(Graphics window)
  {
    //draw a white ball at old ball location


    setX(getX()+xSpeed);
    //setY

    //draw the ball at its new location
  }
   
  public boolean equals(Object obj)
  {




    return false;
  }   

  //add the get methods


  public int getX()
  {
	return xSpeed;
  }

  public int getY()
  {
	return ySpeed;
  }

  public String toString()
  {
	return "" + xSpeed + " " + ySpeed;
  }


  //add a toString() method
}
