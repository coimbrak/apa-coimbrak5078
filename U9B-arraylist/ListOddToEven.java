//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kaila Coimbra
//Date - 3/3/19

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
  public static int go( List<Integer> ray )
  {
	int oddIndex = -1;
	int evenIndex = -1;
	int distance = 0;
	for (int i = 0; i < ray.size(); i++){
		if (ray.get(i) % 2 != 0){
			oddIndex = i;
			break;
		}
	}
	
	int start = ray.size() - 1;
	for (int o = start; int o > oddIndex; o--){
		if (ray.get(o) % 2 == 0){
			evenIndex = o;
			break;
		}
	}

	distance = evenIndex - oddIndex;
	
	if (oddIndex == -1 || evenIndex == -1){
		return -1;
	}
	
	return distance;
  }
}
