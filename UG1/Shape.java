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

                //xPos = 0;
                //yPos = 0;
                //width = 0;
                //height = 0;


	//window.setColor(Color.YELLOW);
	//window.fillRect(xPos + 100,yPos +  300, width + 200, height + 200);
	window.setColor(Color.GREEN);
	window.fillOval(xPos + width/4, yPos + height/4, width/2, width/2);
	window.setColor(Color.RED);
	window.drawLine(xPos+width, yPos, xPos, yPos + height);
	window.drawLine(xPos+width, yPos + height, xPos, yPos);
	


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
