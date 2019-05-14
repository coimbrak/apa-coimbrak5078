//Name - Kaila Coimbra
//Date - 5/13/19
//Class - AP CSA, Period 4
//Lab  - BlackJack Lab


public interface Playerable
{
   public void addCardToHand( Card temp );

   public void resetHand();

   public boolean hit();

   public void setWinCount( int numWins );

   public int getWinCount();

   public int getHandSize();

   public int getHandValue();
}
