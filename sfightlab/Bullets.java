//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
  private List<Ammo> ammo;

  public Bullets()
  {
	ammo = new ArrayList<Ammo>();
  }

  public void add(Ammo al)
  {
	ammo.add(al);
  }

  //post - draw each Ammo
  public void drawEmAll( Graphics window )
  {
//	ammo.draw(window);
        for(int i = 0; i < ammo.size(); i++){
                Ammo one = ammo.get(i);
                if(one.getY() > 0)
			one.draw(window);
	}
  }

  public void moveEmAll()
  {
        for(int i = 0; i < ammo.size(); i++){
                Ammo one = ammo.get(i);
                if(one.getY() > 0)
			one.move("SHOOT");
	}
  }

  public void cleanEmUp()
  {
	for(int i = 0; i < ammo.size(); i++)
		ammo.remove(i);
  }

  public List<Ammo> getList()
  {
    return ammo;
  }

  public String toString()
  {
    return "";
  }
}
