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
    super(200,200,10,10);
    xSpeed = 3;
    ySpeed = 1;
  }

  //add the other Ball constructors
        


public Ball(int x, int y)
{
  super(x,y);
  setXSpeed(3);
  setYSpeed(1);
}

public Ball(int x, int y, int w, int h)
{
  super(x,y,w,h);
  setXSpeed(3);
  setYSpeed(1);
}

public Ball(int x, int y, int w, int h, Color col)
{
  super(x,y,w,h,col);
  setXSpeed(3);
  setYSpeed(1);
}

public Ball(int x, int y, int w, int h, int xS, int yS)
{
  this(x,y,w,h);
  setXSpeed(xS);
  setYSpeed(yS);
}

public Ball(int x, int y, int w, int h, Color col, int xS, int yS)
{
  super(x,y,w,h,col);
  setXSpeed(xS);
  setYSpeed(yS);
}


public void setXSpeed(int x)
{
  xSpeed = x;
}

public void setYSpeed(int y)
{
  ySpeed = y;
}
           
             
           
  //add the set methods
   

  public void moveAndDraw(Graphics window)
  {
    //draw a white ball at old ball location

    Ball one = new Ball(getX(), getY(), getWidth(), getHeight(), Color.WHITE);
    one.draw(window);    

    setX(getX()+xSpeed);
    setY(getY()+ySpeed);

    Ball two = new Ball(getX(), getY(), getWidth(), getHeight(), getColor());
    two.draw(window);
    
 
    //setY

    //draw the ball at its new location
  }
   

  public boolean equals(Object obj)
  {
	Ball rhs = (Ball)obj; 
        return (super.equals(rhs) && xSpeed == rhs.getXSpeed() && ySpeed == rhs.getYSpeed());
  }

  //add the get methods


  public int getX(){
        return super.getX();
  }

  public int getY(){
        return super.getY();
  }

  public int getWidth(){
        return super.getWidth();
  }

  public int getHeight(){
        return super.getHeight();
  }

  public Color getColor(){
        return super.getColor();
  }

  public int getXSpeed()
  {
        return xSpeed;
  }

  public int getYSpeed()
  {
        return ySpeed;
  }

  public String toString()
  {
	return "x pos: " + getX() + ", y pos: " + getY() + ", width: " + getWidth() + ", height: " + getHeight() + ", color:" + getColor()+ ", x speed: "  + xSpeed + ", y speed: " + ySpeed;
  }


  //add a toString() method
}
