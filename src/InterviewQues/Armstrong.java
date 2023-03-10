package InterviewQues;

public class Armstrong {
	public static void main(String[] args) {
		
		int a =153;
		
		int b= a;
		int rem=0;
		int res=0;
		
		while (a>0) {
			
			rem= a%10;
			res=res+(rem*rem*rem);
			a=a/10;
		}
		if (b==res) {
			System.out.println("Armstrong Number");
			
		} else {
			System.out.println("Not a Armstrong Number");
		}
		
		
	}

}
