//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private boolean[] keys;
  private BufferedImage back;
  private Wall leftWall;
  private Wall rightWall;
  private Wall topWall;
  private Wall botWall;
  private Score leftScore;
  private Score rightScore;
  private int width;
  private int height;

  public Pong(int w, int h)
  {
    //set up all variables related to the game
	ball = new Ball(50,50,10,10,Color.BLACK,2,0);
	leftPaddle = new Paddle(0,0,10,80,Color.BLUE,5);
	rightPaddle = new Paddle(w-10,h-80,10,80,Color.GREEN, 5);
	width = w;
	height = h;
	leftWall = new Wall(0,0,1,h, Color.BLACK);
	rightWall = new Wall(w,0,1,height, Color.BLACK);
	topWall = new Wall(0,0,w,1,Color.BLACK);
	botWall = new Wall(0,h,w,1,Color.BLACK);
	leftScore = new Score();
	rightScore = new Score();



    keys = new boolean[4];

    
    setBackground(Color.WHITE);
    setVisible(true);
                
    new Thread(this).start();
    addKeyListener(this);               //starts the key thread to log key strokes
  }
        
  public void update(Graphics window){
    paint(window);
  }

  public void paint(Graphics window)
  {
    //set up the double buffering to make the game animation nice and smooth
    Graphics2D twoDGraph = (Graphics2D)window;

    //take a snap shop of the current screen and same it as an image
    //that is the exact same width and height as the current screen
//    if (back==null)
 //     back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
//    Graphics graphToBack = back.createGraphics();


    ball.moveAndDraw(window);
    leftPaddle.draw(window);
    rightPaddle.draw(window);
  //  graphToBack.setColor(Color.BLACK);
    leftWall.draw(window);
    rightWall.draw(window);
    topWall.draw(window);
    botWall.draw(window);
    leftScore.drawLeft(window);
    rightScore.drawRight(window);

    //see if ball hits left wall or right wall
/*    if (!(ball.getX()>=10 && ball.getX()<=780))
    {
      ball.setXSpeed(0);
      ball.setYSpeed(0);
    }
*/
    if(ball.didCollideLeft(leftWall)){
	rightScore.incRightScore();
	rightScore.drawRight(window);
	Ball b = new Ball(getX(), getY(), getWidth(), getHeight(), Color.WHITE);
        b.draw(window);
	//ball.setColor(Color.WHITE);
	ball.setX(width/2);
	ball.setY(height/2);
	//ball.setColor(Color.BLACK);
    }
    else if(ball.didCollideRight(rightWall)){
	leftScore.incLeftScore();
	leftScore.drawLeft(window);
	Ball b = new Ball(getX(), getY(), getWidth(), getHeight(), Color.WHITE);
	b.draw(window);
	//ball.setColor(Color.WHITE);
	ball.setX(400);
	ball.setY(300);
	//ball.setColor(Color.BLACK);
    }
                
    //see if the ball hits the top or bottom wall 
/*    if (!(ball.getY()>=10 && ball.getY()<=780))
    {
	ball.setXSpeed(0);
	ball.setYSpeed(0);
    }
*/
    if(ball.didCollideTop(topWall)||ball.didCollideBottom(botWall))
	ball.setYSpeed(-ball.getYSpeed());

    if(ball.didCollideLeft(leftPaddle)||ball.didCollideRight(rightPaddle))
	ball.setXSpeed(-ball.getXSpeed());

    if(ball.didCollideTop(leftPaddle)||ball.didCollideBottom(leftPaddle)||
     ball.didCollideTop(rightPaddle)||ball.didCollideBottom(rightPaddle))
	ball.setYSpeed(-ball.getYSpeed());



    //see if the ball hits the left paddle
/*     
    if((ball.getX()<=leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
	 && (ball.getY()>=leftPaddle.getY() && ball.getY()<=leftPaddle.getY() + 
	 leftPaddle.getHeight() || ball.getY() + ball.getHeight() >= leftPaddle.getY() && 
	 ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())))
    {
	if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
		ball.setYSpeed(ball.getYSpeed() * -1);
	else
		ball.setXSpeed(ball.getXSpeed() * -1);
    }
           
                
                
    //see if the ball hits the right paddle
                
    if((ball.getX()>=rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(ball.getXSpeed())
         && (ball.getY()>=rightPaddle.getY() && ball.getY()<=rightPaddle.getY() +
         rightPaddle.getHeight() || ball.getY() + ball.getHeight() >= rightPaddle.getY() &&
         ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())))
    {
        if(ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth()-Math.abs(ball.getXSpeed()))
                ball.setYSpeed(ball.getYSpeed() * -1);
        else
                ball.setXSpeed(ball.getXSpeed() * -1);
    }
                
  */              


    //see if the paddles need to be moved


    if(keys[0] && leftPaddle.getY() >= 5)
	leftPaddle.moveDownAndDraw(window);

    if(keys[1] && leftPaddle.getY() <= height-5-leftPaddle.getHeight())
	leftPaddle.moveUpAndDraw(window);

    if(keys[2] && rightPaddle.getY() >= 5)
	rightPaddle.moveDownAndDraw(window);

    if(keys[3] && rightPaddle.getY() <= height-5-rightPaddle.getHeight())
	rightPaddle.moveUpAndDraw(window);


                
    twoDGraph.drawImage(back, null, 0, 0);
  }

  public void keyPressed(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=true; break;
    case 'Z' : keys[1]=true; break;
    case 'I' : keys[2]=true; break;
    case 'M' : keys[3]=true; break;
    }
  }

  public void keyReleased(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
    case 'W' : keys[0]=false; break;
    case 'Z' : keys[1]=false; break;
    case 'I' : keys[2]=false; break;
    case 'M' : keys[3]=false; break;
    }
  }

  public void keyTyped(KeyEvent e){}
        
  public void run()
  {
    try
    {
      while(true)
      {
        Thread.currentThread().sleep(8);
        repaint();
      }
    }catch(Exception e)
    {
    }
  }     
}
