package InterviewQues;

public class WordReverseinString {
	public static void main(String[] args) {
		
		String str ="Java Oracle Selenium Sql";
		
		String[] word = str.split(" ");
		
		String revString = "";
		
		for (String wo : word) {
			
		 String revword = " ";
		 
		 for (int i=wo.length()-1; i >=0; i--) {
			
			 revword= revword+wo.charAt(i);
		}
			revString =revString+revword;
		
		}
		
		System.out.print(revString);
	}

	

}
