//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA
//Lab  - BlackJack Lab

public class BlackJackCard extends Card
{
  //constructors


  public BlackJackCard()
  {
	super();
  }

  public BlackJackCard(int f, String s)
  {
	super(f,s);
  }



  public int getValue()
  {
    //enables you to build the value for the game into the card
    //this makes writing the whole program a little easier

	int value = 0;
	if(getFace() == 1)
		value = 11;

	else if(getFace() > 10)
		value = 10;

	else
		value = getFace();

	return value;
  }
}
