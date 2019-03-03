//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra
//Date - 3/3/19

import java.util.ArrayList;

public class SumFirstRunner
{
  public static void main( String args[] )
  {
        ArrayList<Integer> a;
        a = new ArrayList<Integer>();
        a.add(9);
        a.add(10);
        a.add(-88);
        a.add(100);
        a.add(-555);
	a.add(2);
        System.out.println(a);
        System.out.println(ListSumFirst.go(a));

        ArrayList<Integer> b;
        b = new ArrayList<Integer>();
        b.add(10);
        b.add(9);
        b.add(8);
        b.add(6);
        b.add(4);
        b.add(-99);
        System.out.println(b);
        System.out.println(ListSumFirst.go(b));										

  }
}
