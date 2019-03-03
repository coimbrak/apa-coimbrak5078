//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	public static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int length = getNumDigits(number);
		int[] sorted = new int[length];
		int index = -1;
		int value = 0;
		while (number > 0) {
			value = number % 10;
			index++;
			sorted[index] = value;
			number = number / 10;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}
