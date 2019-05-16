//Name - Kaila Coimbra
//Date - 5/16/19
//Class - AP CSA, Period 44
//Lab  - BlackJack Lab

import static java.lang.System.*;
import java.awt.Color;

public class PlayerTestOne
{
  public static void main( String args[] )
  {
    Player player = new Player();

    Deck deck = new Deck();
    deck.shuffle();

    player.addCardToHand(deck.nextCard());
    player.addCardToHand(deck.nextCard());

    out.println("\n\ntoString");
    out.println(player);

    out.println("\n\nhandValue");
    out.println(player.getHandValue());

    player.addCardToHand(deck.nextCard());
    player.addCardToHand(deck.nextCard());

    out.println("\n\ntoString");
    out.println(player);

    out.println("\n\nhandValue");
    out.println(player.getHandValue());
  }
}
