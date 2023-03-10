package InterviewQues;

public class LowerUpperDigits {
	public static void main(String[] args) {
		
		String str = "Java12345@PYTHON$";
		
		String cap ="";
		int capCount =0;
		
		String small ="";
		int smallCount =0;
		
		String digits ="";
		int digitsCount =0;
		
		String spl ="";
		int splCount =0;
		
		
		for (int i = 0; i < str.length(); i++) {
			
			char a = str.charAt(i);
			int b = a;
			
			if (b>=48 && b<=57) {
				digits =digits+a;
				digitsCount++;
			}
			else if (b>=65&& b<=90) {
				cap =cap+a;
				capCount++;
				
			}
			else if (b>=97&& b<=122) {
				small = small+a;
				smallCount++;
				
			}	
			else {
				spl=spl+a;
				splCount++;
				
			}
			}
			
			System.out.println("Digits : "+digits);
			System.out.println("Digits count : " +digitsCount);
			
			System.out.println("Capital Letters : " +cap );
			System.out.println("Capital Letters Count : " +capCount);
			
			System.out.println("Small Letters : " +small);
			System.out.println("Small Letters Count : " +smallCount);
			
			System.out.println("Special Characters : "+spl);
			System.out.println("Special Characters Count :" +splCount);
			
		}
	
	}


