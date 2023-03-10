package InterviewQues;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class IntegerArraySort {
public static void main(String[] args) {
	
	int nos [] = {5,8,6,9,1,12,18,22,8,6,1};
	
	Set<Integer> se = new TreeSet<Integer>();
	
	for (int i = 0; i < nos.length; i++) {
		
		int a = nos[i];
		se.add(a);
	}
   System.out.println("Ascending order ");
	for (Integer sort : se) {
	
		System.out.println(sort);
		
	}

}
}
