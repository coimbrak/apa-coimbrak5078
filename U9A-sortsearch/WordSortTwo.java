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
		int count2 = 0;
		
                for (int i = 0; i < sentence.length(); i++){
			if (sentence.charAt(i) == ' '){
				count2++;
			}
		}
           
		wordRay = new String[count2 + 1];

		for(int n = 0; n < count2; n++){
			if (lastIndex == -1){
				break;
			}
			lastIndex = sentence.indexOf(" ");
			word = sentence.substring(0, lastIndex);
			sentence = sentence.substring(lastIndex + 1);
			//firstIndex = lastIndex + 1;
			wordRay[count] = word;
			count++;
		}

		wordRay[count2] = sentence;

	
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
