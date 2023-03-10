package InterviewQues;

public class IntegerSortingWithDup {
public static void main(String[] args) {
	
	int[] a = {10,50,23,45,68,8,15,50,45};
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j =i+1; j < a.length; j++) {
			
		 if (a[i]>a[j]) {
			
			int c= a[i];
			a[i]=a[j];
			a[j]=c;	
		}	
	}
}
	System.out.println("Ascending order with duplicates");
	for (int i : a) {
		System.out.println(i);
	}
	
}
}
