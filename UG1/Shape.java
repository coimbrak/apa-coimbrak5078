//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kaila Coimbra
//Date - 3/3/19
//Class - AP CSA (Period 4)
//Lab  - Shape

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);

	window.setColor(Color.YELLOW);
	window.fillRect(100, 300, 200, 200);
	window.setColor(Color.GREEN);
	window.fillOval(100, 300, 100, 100);
	window.setColor(Color.RED);
	window.drawLine(100, 300, 300, 500);
	window.drawLine(300, 300, 100, 500);
	


      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
