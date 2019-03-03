//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra
//Date - 3/3/19

public class OddToEvenRunner
{
  public static void main( String args[] )
  {
	ArrayList<Integer> a;
	a = new Arraylist<Integer>();
	a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(8);
	System.out.println(a);
	System.out.println(ListOddToEven.go(a));

        ArrayList<Integer> b;
        b = new Arraylist<Integer>();
        b.add(32767);
        b.add(70);
        b.add(4);
        b.add(5);
        b.add(6);
	b.add(7);
        System.out.println(b);
	System.out.println(ListOddToEven.go(b));	

  }
}
