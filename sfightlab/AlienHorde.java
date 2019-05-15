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
  private boolean gameEnd;

  public AlienHorde(int size)
  {
	aliens = new ArrayList<Alien>();
	Alien alien = new Alien();
	add(alien);
	gameEnd = false;
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

  public List<Alien> getList(){
	return aliens;
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
			one.setY(one.getY() + 40);
		}
		if(one.getY() >= 600-one.getHeight())
			break;
	}
  }

  public boolean removeDeadOnes(List<Ammo> shots, Graphics window)
  {
//   int count = 0;
   for(int n = aliens.size() - 1; n >= 0; n--){
      Alien alien = aliens.get(n);

      for(int i = shots.size() - 1; i >= 0; i--){
	Ammo ammo = shots.get(i);

	if(ammo.getY() <= alien.getY() + alien.getHeight() && ammo.getY() >= alien.getY() &&
         ammo.getX() > alien.getX() - ammo.getWidth() && ammo.getX() < alien.getX() +
         alien.getWidth()){
		aliens.remove(n);
		shots.remove(i);
		//count++;
		break;
	}

/*
        if(aliens.size() == 0 || alien.getY() >= 400 - alien.getHeight()){
                gameOver(shots, window);
                gameEnd = true;
		System.out.println("game over");
                window.setColor(Color.WHITE);
                window.drawString("GAME OVER", 200, 200);
                break;
        }

*/

/* code for second half of if statement
|| ship.getY() <=
         alien.getY() + alien.getHeight() && ship.getY() >= alien.getY() && ship.getX() >
         alien.getX() - ship.getWidth() && ship.getX() < alien.getX() + alien.getWidth()
*/

      }//second for loop


        if(aliens.size() == 0 || alien.getY() >= 400 - alien.getHeight()){
                gameOver(shots, window);
                gameEnd = true;
//                System.out.println("game over");
//                window.setColor(Color.WHITE);
//                window.drawString("GAME OVER", 200, 200);
                break;
        }


  }//first for loop

	return gameEnd;

  }


  public void gameOver(List<Ammo> shots, Graphics window)
  {
    for(int i = 0; i < shots.size(); i++){
      for(int n = 0; n < aliens.size(); n++){
	aliens.remove(n);
	shots.remove(i);
	break;
//	window.setColor(Color.GREEN);
//	window.setColor(Color.WHITE);
//	System.out.println("GAME OVER");
//	window.drawString("GAME OVER", 200, 200);
//	ship.setWidth(0);
//	ship.setHeight(0);
//	break;
      }
    }
  }


/*  extra code for removeDeadOnes
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



  public String toString()
  {
    return "";
  }
}
