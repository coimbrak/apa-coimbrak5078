//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
  //instance variables
  private int speed;

  public Paddle()
  {
    super(10,10);
    speed = 5;
  }


  //add the other Paddle constructors

  public Paddle(int x, int y){
	super.setX(x);
	super.setY(y);
  }

  public Paddle(int x, int y, int sp){
	super.setX(x);
	super.setY(y);
	setSpeed(sp);
  }

  public Paddle(int x, int y, int w, int h, int sp){
	this(x,y,sp);
	super.setWidth(w);
	super.setHeight(h);
  }

  public Paddle(int x, int y, int w, int h, Color col, int sp){
	this(x,y,w,h,sp);
	super.setColor(col);
  }





  public void moveUpAndDraw(Graphics window)
  {
    	draw(window, Color.WHITE);
	super.setY(getY() + speed);
	super.draw(window);
     
  }

  public void moveDownAndDraw(Graphics window)
  {
     	draw(window, Color.WHITE);
	super.setY(getY() - speed);
	super.draw(window);
     

  }

  //add get methods

  public void setSpeed(int sp){
	speed = sp;
  }
   
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

  public int getSpeed(){
	return speed;
  }


  public String toString(){
	return "x pos: " + getX() + ", y pos: " + getY() + ", width: " + getWidth() + ", height: " + getHeight() + ", color: " + getColor() + ", speed: " + speed;
  }
   
  //add a toString() method
}
