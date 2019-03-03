//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra
//Date - 3/3/19

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
  public static int go(List<Integer> ray)
  {
	int first = ray.get(0);
	int sum = 0;
	for (int i = 1; i < ray.size(); i++){
		if (ray.get(i) > first){
			sum = sum + ray.get(i);
		}
	}
	
	if (sum > 0){
		return sum;
	}

	return -1;

  }
}
