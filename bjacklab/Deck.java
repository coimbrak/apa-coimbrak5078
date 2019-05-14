//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA, Period 4
//Lab  - BlackJack Lab

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
  public static final int NUMFACES = 13;
  public static final int NUMSUITS = 4;
  public static final int NUMCARDS = 52;

  public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

  private int topCardIndex;
  private ArrayList<Card> stackOfCards;

  public Deck ()
  {
    //initialize data - stackOfCards - topCardIndex
    //loop through suits
    //loop through faces
    //add in a new card
	stackOfCards = new ArrayList<Card>();
	for(int s = 0; s < NUMSUITS; s++){
		for(int f = 1; f < NUMFACES+1; f++){
			stackOfCards.add(new BlackJackCard(f, SUITS[s]));
		}
	}
	topCardIndex = stackOfCards.size();

  }

  //modifiers
  public void shuffle ()
  {
    //shuffle the deck
    //reset variables as needed

	Collections.shuffle(stackOfCards);
	topCardIndex = stackOfCards.size();
  }

  //accessors
  public int size ()
  {
    return stackOfCards.size();
  }

  public int numCardsLeft()
  {
    return topCardIndex;
  }

  public Card nextCard()
  {
    topCardIndex--;
    return stackOfCards.get(topCardIndex);
  }

  public String toString()
  {
    return stackOfCards + "   topCardIndex = " + topCardIndex;
  }
}
