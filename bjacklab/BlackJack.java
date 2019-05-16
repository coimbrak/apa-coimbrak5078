//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA, Period 4
//Lab  - BlackJack Lab

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
  //add in Player instance variable
  //add in Dealer instance variable

  private Player player;
  private Dealer dealer;

  public BlackJack()
  {
	player = new Player();
	dealer = new Dealer();
  }

  public void playGame()
  {
    Scanner keyboard = new Scanner(System.in);
    char choice = 0;
    boolean hitTrue = true;

	player.resetHand();
	dealer.resetHand();
	dealer.shuffle();



	player.addCardToHand(dealer.deal());
	player.addCardToHand(dealer.deal());

	while(hitTrue && player.getHandValue() <= 21){

		out.println("\n\nCurrent hand hand = " + player);
		out.println("\nDo you want to hit? [y/n] ");
		String output = keyboard.next();

		if(output.equals("y")){
			player.addCardToHand(dealer.deal());
		}
		else{
			hitTrue = false;
		}
	}


	dealer.addCardToHand(dealer.deal());
	dealer.addCardToHand(dealer.deal());

	while(dealer.getHandValue() <= 16){
		dealer.addCardToHand(dealer.deal());
	}

	int playerTotal = player.getHandValue();
	int dealerTotal = dealer.getHandValue();




    out.println("\n\nPLAYER ");
    out.println("Hand Value :: " + playerTotal );
    out.println("Hand Size :: " + player.getHandSize() );
    out.println("Cards in Hand :: " + player.toString() );
    out.println("\nDEALER ");
    out.println("Hand Value :: " + dealerTotal );
    out.println("Hand Size :: " + dealer.getHandSize() );
    out.println("Cards in Hand :: " + dealer.toString() );

    if(playerTotal>21&&dealerTotal<=21)
    {
      out.println("\n\nDealer wins - Player busted!");
      dealer.setWinCount(dealer.getWinCount() + 1);
    }
    else if(playerTotal<=21&&dealerTotal>21)
    {
      out.println("\n\nPlayer wins - Dealer busted!");
      player.setWinCount(player.getWinCount() + 1);
    }
    else if(playerTotal>21&&dealerTotal>21){
      out.println("\n\nBoth players bust!");
    }
    else if(playerTotal<dealerTotal){
      out.println("\n\nDealer has bigger hand value!");
      dealer.setWinCount(dealer.getWinCount() + 1);
    }
    else{
      out.println("\n\nPlayer has bigger hand value!");
      player.setWinCount(player.getWinCount() + 1);
    }

    out.println("\n\nDealer has won " + dealer.getWinCount() + " times.");
    out.println("Player has won " + player.getWinCount() + " times.");

  }



/* method to check if hit is yes for player (unnecessary)
  public String hitYes()
  {
	Scanner key = new Scanner(System.in);

        player.addCardToHand(dealer.deal());
        out.println("Current hand hand = " + player);
        out.println("Do you want to hit? [y/n] ");
	String response = key.next();

	return response;
  }
*/

  public static void main(String[] args)
  {
    Scanner keyB = new Scanner(System.in);
    BlackJack game = new BlackJack();
    game.playGame();
    boolean keepPlay = true;

    while(keepPlay){
       out.println("Do you want to play again? [y/n] ");
       String playAgain = keyB.next();
       if(playAgain.equals("y"))
       {
          game.playGame();
       }
       else{
          keepPlay = false;
       }
    }

  } //end main method
} //end BlackJack class
