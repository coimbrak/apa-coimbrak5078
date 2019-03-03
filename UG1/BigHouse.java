//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kaila Coimbra
//Date - 3/3/19
//Class - AP CSA (Period 4)
//Lab  - BigHouse Lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );

	window.setColor(Color.GREEN);
	window.fillRect( 140, 150, 520, 80);
	window.setColor(Color.YELLOW);
	window.fillRect( 250, 300, 70, 70);
        window.setColor(Color.YELLOW);
        window.fillRect( 500, 300, 70, 70);
        window.setColor(Color.WHITE);
        window.fillRect( 350, 500, 100, 150);

   }
}
