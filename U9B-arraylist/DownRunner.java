//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra
//Date - 3/2/19

import java.util.ArrayList;

public class DownRunner
{

  public static void main( String args[] )
  {

	ArrayList<Integer> a;
	a = new ArrayList<Integer>();
	a.add(255);
	a.add(255);	
	System.out.println(a);
	System.out.println(ListDown.go(a));
        ArrayList<Integer> b;
        b = new ArrayList<Integer>();
        b.add(10);
	b.add(9);
	b.add(6);
	b.add(4);
	b.add(1);
	b.add(0);
	b.add(-99);
        System.out.println(b);
	System.out.println(ListDown.go(b));   
								
  }
}
