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
import java.util.ArrayList;
import java.util.List;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
  private Ship ship;
//  private Alien alienOne;
//  private Alien alienTwo;
  private Ammo ammo;
  private AlienHorde horde;
  private Bullets shots;

  private List<Ammo> bulletsList;


  /* uncomment once you are ready for this part
   *
   private AlienHorde horde;
   private Bullets shots;
  */


  private boolean[] keys;
  private BufferedImage back;

  public OuterSpace()
  {
    setBackground(Color.black);

    keys = new boolean[5];

	ship = new Ship();
//	alienOne = new Alien(200,20,30,30,0);
//	alienTwo = new Alien(300,20,30,30,0);
	ammo = new Ammo();
	horde = new AlienHorde(20);
	shots = new Bullets();
//	bulletsList = new ArrayList<Ammo>();
	bulletsList = shots.getList();
  //instantiate other instance variables
    //Ship, Alien

    this.addKeyListener(this);
    new Thread(this).start();

    setVisible(true);
  }

  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint( Graphics window )
  {
    //set up the double buffering to make the game animation nice and smooth
    Graphics2D twoDGraph = (Graphics2D)window;

    //take a snap shop of the current screen and same it as an image
    //that is the exact same width and height as the current screen
    if(back==null)
      back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics graphToBack = back.createGraphics();

    graphToBack.setColor(Color.BLUE);
    graphToBack.drawString("StarFighter ", 25, 50 );
    graphToBack.setColor(Color.BLACK);
    graphToBack.fillRect(0,0,800,600);
    ship.draw(graphToBack);

    horde.drawEmAll(graphToBack);
    horde.moveEmAll();
//    alienOne.draw(graphToBack);
//    alienTwo.draw(graphToBack);

/*    if(ammo.getY() > 0){
	ammo.draw(graphToBack);
	ammo.move("SHOOT");
    }
*/

	for(int i = 0; i < bulletsList.size(); i++){
		bulletsList.get(i).draw(graphToBack);
		bulletsList.get(i).move("SHOOT");
	}

    shots.drawEmAll(graphToBack);
    shots.moveEmAll();

//	horde.removeDeadOnes(shots);


/*
    for(int i = 0; i < horde.size(); i++){
	if(ammo.getY() == horde.get(i).getY()+horde.get(i).getHeight() && ammo.getX() >
         horde.get(i).getWidth() - ammo.getX() && ammo.getX() < horde.get(i).getX() +
         horde.get(i).getWidth())
		horde.remove(i);
    }
*/

    if(keys[0] == true)
    {
      ship.move("LEFT");
    }

    if(keys[1] == true)
    {
      ship.move("RIGHT");
    }

    if(keys[2] == true)
    {
      ship.move("UP");
    }

    if(keys[3] == true)
    {
      ship.move("DOWN");
    }
    if(keys[4] == true)
    {

	shots.add(new Ammo(ship.getX() + ship.getWidth()/2, ship.getY(), 1));

/*      ammo = new Ammo(ship.getX() + ship.getWidth()/2,ship.getHeight(),1);
      ammo.setX(ship.getX() + ship.getWidth()/2 - ammo.getWidth()/2);
      ammo.setY(ship.getY());
      keys[4] = false;

	for(int i = 0; i < bulletsList.size(); i++){
		Ammo one = bulletsList.get(i);
		one.setX(ship.getX() + ship.getWidth()/2 - one.getWidth()/2);
		one.setY(ship.getY());
		one.move("SHOOT");
		keys[4] = false;
	}
*/
    }

//	horde.removeDeadOnes(bulletsList);

    //add code to move Ship, Alien, etc.


    //add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


    twoDGraph.drawImage(back, null, 0, 0);
  }


  public void keyPressed(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
      keys[0] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      keys[1] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_UP)
    {
      keys[2] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN)
    {
      keys[3] = true;
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE)
    {
      keys[4] = true;
    }
    repaint();
  }

  public void keyReleased(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
      keys[0] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      keys[1] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_UP)
    {
      keys[2] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN)
    {
      keys[3] = false;
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE)
    {
      keys[4] = false;
    }
    repaint();
  }

  public void keyTyped(KeyEvent e)
  {
    //no code needed here
  }

  public void run()
  {
    try
    {
      while(true)
      {
        Thread.currentThread().sleep(5);
        repaint();
      }
    }catch(Exception e)
    {
    }
  }
}

