//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kaila Coimbra
//Date - 3/3/19
//Class - AP CSA (Period 4)
//Lab  - ShapePanel.java

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);
		
		Shape image = new Shape (100,100,50,50,Color.BLUE);
		image.draw(window);

		Shape image2 = new Shape(400, 140, 100, 100, Color.RED);
		image2.draw(window);

		Shape image3 = new Shape(500, 300, 180, 180, Color.BLACK);
		image3.draw(window);
		
                Shape image4 = new Shape (200, 400, 130, 130, Color.YELLOW);
                image4.draw(window);

		//instantiate a Shape
		//tell your shape to draw
	}
}
