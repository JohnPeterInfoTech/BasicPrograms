package InterviewQues;

public class PalindromeNo {
public static void main(String[] args) {

	int num = 3553;
	int n=num;
	int rem =0;
	int res =0;
	
	while (num>0) {
		
		rem = num%10;
		res = (res*10)+rem;
		num=num/10;
		
	}
	if (n==3553) {
		System.out.println("The given number is palindrome");
	}
	else {
		System.out.println("The given number is not a Palindrome");
	}
	}
	}


