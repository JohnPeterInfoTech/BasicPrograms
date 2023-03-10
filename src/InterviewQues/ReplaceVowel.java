package InterviewQues;

public class ReplaceVowel {
	public static void main(String[] args) {
		
		String str = "Java SQL SElenIUm Oracle";
		
		char[] w = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			
		if (str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I'||str.charAt(i)=='O' || str.charAt(i)== 'U'
				||	str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)== 'u') {
				
					
				w[i]= '*';	
			}	
			}
		for (int j = 0; j < str.length(); j++ ) {
			System.out.print(w[j]);
			
		}
	}

}
