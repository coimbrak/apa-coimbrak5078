//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kaila Coimbra
//Date - 3/3/19
//Class - AP CSA (Period 4)
//Lab  - Robot

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
  public Robot()    //constructor method - sets up the class
  {
    setSize(800,600);
    setBackground(Color.WHITE);   	
    setVisible(true);
  }
  
  public void paint( Graphics window )
  {
    window.setColor(Color.BLUE);
    
    window.drawString("Robot LAB ", 35, 35 );
    
    head(window);
    upperBody(window);
    lowerBody(window);

    //call head method
    
    //call other methods
    
  }
  
  public void head( Graphics window )
  {
    window.setColor(Color.YELLOW);
    
    window.fillOval(300, 100, 200, 100);
    
	window.setColor(Color.GREEN);
	window.fillOval(330, 120, 20, 20);
	window.fillOval(450, 120, 20, 20);

	window.setColor(Color.BLACK);
	window.fillOval(390, 150, 20, 10);

	window.setColor(Color.RED);
	window.drawArc(350, 170, 100, 20, 150, 190);

    //add more code here
    
  }

  public void upperBody( Graphics window )
  {

	window.setColor(Color.BLUE);
	window.fillRect(300, 220, 200, 80);
	window.setColor(Color.BLACK);
	window.drawLine(500, 220, 600, 140);
	window.drawLine(300, 220, 200, 140);

    //add more code here
  }

  public void lowerBody( Graphics window )
  {
	
	window.setColor(Color.GRAY);
	window.fillRect(300, 330, 200, 80);
	window.setColor(Color.BLACK);
	window.drawLine(500, 410, 600, 490);
	window.drawLine(300, 410, 200, 490);

    //add more code here
    
  }
}
