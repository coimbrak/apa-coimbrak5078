//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] )  throws IOException
	{
		int[] newArray = new int[5];
		newArray = NumberShifter.makeLucky7Array(5);
		for (int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}
	}
}



