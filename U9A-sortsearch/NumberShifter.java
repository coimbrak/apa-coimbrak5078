//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] fillArray = {5,7,7,2,1};
		shiftEm(fillArray);
		return fillArray;	
	}


	public static void shiftEm(int[] array)
	{
		int count = 0;
                int placeholder = 0;
                for (int i = 0; i < array.length; i++){
                        if (array[i] == 7){
                                placeholder = array[count];
                                array[count] = array[i];
                                array[i] = placeholder;
                                count++;
			}
		}

	}
}
