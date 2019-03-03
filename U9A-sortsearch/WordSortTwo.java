//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int lastIndex = 0;
		String word = "";
		int firstIndex = 0;
		int count = 0;
		while (lastIndex < sentence.length()){
			if (lastIndex == -1){
				break;
			}
			lastIndex = sentence.indexOf(" ");
			word = sentence.substring(firstIndex, lastIndex);
			sentence = sentence.substring(lastIndex);
			firstIndex = lastIndex + 1;
			wordRay[count] = word;	
			count++;
		}

	
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output = "" + Arrays.toString(wordRay);
		return output+"\n\n";
	}
}
