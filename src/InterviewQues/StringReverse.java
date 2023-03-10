package InterviewQues;

public class StringReverse {
	public static void main(String[] args) {
		
		
		String str = "Java Python Oracle Prgramming";
		
		String[] split = str.split(" ");
		
		String reverseword =" ";
		
		for (int i = split.length-1; i >=0; i--) {
			
			String reverse= reverseword+split[i];
			System.out.print(reverse);
		}
	}
}
