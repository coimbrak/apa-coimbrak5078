//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kaila Coimbra
//Date - 3/3/19
//Class - AP CSA (Period 4)
//Lab  - SmileyFace.java

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JFrame;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

     	window.setColor(Color.GREEN);
	window.fillOval( 290, 200, 70, 50 );
        window.setColor(Color.GREEN);
        window.fillOval( 470, 200, 70, 50 );
	window.setColor(Color.BLACK);
	window.fillOval( 390, 300, 40, 40 );
	window.setColor(Color.RED);
	window.drawArc(300, 380, 240, 20, 150, 190 );


   }
}
