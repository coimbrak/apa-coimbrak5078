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

public class AlienHorde
{
  private List<Alien> aliens;

  public AlienHorde(int size)
  {
	aliens = new ArrayList<Alien>();
	for(int i = 0; i < size; i++){
		Alien alien = new Alien();
		add(alien);
	}
  }

  public void add(Alien al)
  {
	for(int col = 0; col < 800; col = col + 80){
		for(int row = 50; row < 200; row = row + 80){
			al = new Alien(col,row,30,30,1);
			aliens.add(al);
		}
	}
  }

  public void drawEmAll( Graphics window )
  {
	for(int i = 0; i < aliens.size(); i++){
		aliens.get(i).draw(window);
	}
  }

  public void moveEmAll()
  {
	for(int i = 0; i < aliens.size(); i++){
		Alien one = aliens.get(i);
		one.setX(one.getX()+1);
		if(one.getX() >= 800-one.getWidth()){
			one.setX(0);
			one.setY(one.getY() + 30);
		}
		if(one.getY() >= 600-one.getHeight())
			break;
	}
  }

  public void removeDeadOnes(List<Ammo> shots)
  {

   for(int i = 0; i < shots.size(); i++){
      for(int n = 0; n < aliens.size(); n++){
	Ammo ammo = shots.get(i);
	Alien alien = aliens.get(n);
	if(ammo.getY() == alien.getY() + alien.getHeight() && ammo.getX() > alien.getWidth()
          - ammo.getX() && ammo.getX() < alien.getX() + alien.getWidth())
		aliens.remove(n);
		shots.remove(i);
      }
   }

/*
    for(int i = 0; i < aliens.size(); i++){
        if(shots.getY() == aliens.get(i).getY() + aliens.get(i).getHeight() && shots.getX() >
         aliens.get(i).getWidth() - shots.getX() && shots.getX() < aliens.get(i).getX() +
         aliens.get(i).getWidth())
                aliens.remove(i);
    }

	for(int i = 0; i < aliens.size(); i++){
		if(10 == aliens.get(i).getY() + aliens.get(i).getHeight() && 10 >
                 aliens.get(i).getWidth() - 10 && 10 < aliens.get(i).get(X) + 10)
			aliens.remove(i);
	}
*/


  }

  public String toString()
  {
    return "";
  }
}
