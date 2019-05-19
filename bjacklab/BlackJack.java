//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA, Period 4
//Lab  - BlackJack Lab

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
  //add in Player instance variable
  //add in Dealer instance variable

//  private Player player;
//  private Dealer dealer;

    private ArrayList<Playerable> players;

  public BlackJack(int playerCount)
  {
	//player = new Player();
	//dealer = new Dealer();
	players = new ArrayList<Playerable>();
	players.add(new Dealer());
	for(int i = 0; i < playerCount; i++)
		players.add(new Player());
  }

  public void playGame()
  {
    Scanner keyboard = new Scanner(System.in);
    char choice = 0;
    boolean hitTrue = true;

    do{

	Dealer dealer = (Dealer)players.get(0);

	dealer.resetHand();
	dealer.shuffle();


	for(int a = 1; a < players.size(); a++){
		Player player = (Player)players.get(a);
		player.resetHand();
		hitTrue = true;
		for(int b = 0; b < 2; b++){
			player.addCardToHand(dealer.deal());
		}


		while(hitTrue){
			out.println("\n\n*** PLAYER " + a + " ***");
			out.println("\nCurrent hand = " + player);
			out.println("\nDo you want to hit? [y/n] ");
			String output = keyboard.next();

			if(output.equals("y") && player.getHandValue() < 21){
				player.addCardToHand(dealer.deal());
			}
			else{
				out.println("\n\n*** PLAYER " + a + " ***");
				out.println("\nFINAL HAND = " + player);
				hitTrue = false;
			}
		}
	}

	dealer.addCardToHand(dealer.deal());
	dealer.addCardToHand(dealer.deal());

	while(dealer.getHandValue() <= 16){
		dealer.addCardToHand(dealer.deal());
	}

//	int playerTotal = player.getHandValue();
//	int dealerTotal = dealer.getHandValue();



   for(int c = 1; c < players.size(); c++){
    out.println("\n\nPLAYER " + c);
    out.println("Hand Value :: " + players.get(c).getHandValue() );
    out.println("Hand Size :: " + players.get(c).getHandSize() );
    out.println("Cards in Hand :: " + players.get(c).toString() );
   }


    out.println("\nDEALER ");
    out.println("Hand Value :: " + dealer.getHandValue() );
    out.println("Hand Size :: " + dealer.getHandSize() );
    out.println("Cards in Hand :: " + dealer.toString() );


	int winNum = 0;
	for(int d = 0; d < players.size(); d++){
		int val = players.get(d).getHandValue();
		if(val > winNum && val <= 21)
			winNum = val;
	}

	if(winNum == 0){
		out.println("\n\nNo winner - everyone busted!");
	}
	else{
		for(int e = 1; e < players.size(); e++){
			if(players.get(e).getHandValue() == winNum){
				out.println("\n\nPlayer " + e + " has best hand value!");
				players.get(e).setWinCount(players.get(e).getWinCount() + 1);
			}
		}
		if(dealer.getHandValue() == winNum){
			out.println("\n\nDealer has best hand value!");
			dealer.setWinCount(dealer.getWinCount() + 1);
		}
	}

/*
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
*/


    out.println("\n\nDealer has won " + dealer.getWinCount() + " times.");

    for(int f = 1; f < players.size(); f++){
	out.println("Player " + f + " has won " + players.get(f).getWinCount() + " times.");

    }


   out.println("Do you want to play again? [y/n] ");
   choice = keyboard.next().charAt(0);

   }while(choice == 'y');

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
    out.println("How many players? ");
    int numPlayers = keyB.nextInt();
    if(numPlayers < 1)
	out.println("Cannot play with less than one player.");
    else{
	BlackJack game = new BlackJack(numPlayers);
	game.playGame();
    }

/*
	boolean keepPlay = true;

        while(keepPlay){
           out.println("Do you want to play again? [y/n] ");
           String playAgain = keyB.next();
           if(playAgain.equals("y"))
           {
		out.println("How many players? ");
		numPlayers = keyB.nextInt();
		if(numPlayers < 1)
			out.println("Cannot play with less than one player.");
		else{
			BlackJack gameAgain = new BlackJack(numPlayers);
			gameAgain.playGame();
                }
           }
           else{
              keepPlay = false;
           }
        }
    }

*/

  } //end main method
} //end BlackJack class
