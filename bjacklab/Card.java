//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA, Period 4
//Lab  - BlackJack Lab


public abstract class Card
{
  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
                                        "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

  private String suit;
  private int face;

  //constructors

  public Card(){
	suit = "";
	face = 0;
  }

  public Card(int f, String s){
	setFace(f);
	setSuit(s);
  }


  // modifiers

  public void setFace(int f){
        face = f;
  }

  public void setSuit(String s){
	suit = s;
  }


  //accessors

  public int getFace(){
	return face;
  }

  public String getSuit(){
        return suit;
  }


  public abstract int getValue();


  public boolean equals(Object obj)
  {
	Card other = (Card)obj;
	return face == other.getFace() && suit.equals(other.getSuit());
  }

  //toString

  public String toString()
  {
	return FACES[face] + " of " + getSuit() + " | value = " + getValue();
  }


}
