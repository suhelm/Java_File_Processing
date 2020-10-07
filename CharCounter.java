import java.io.BufferedReader;
import java.io.IOException;

public class CharCounter implements ICounter {

	@Override

	
	public void doCounting(StringBuilder fileContent) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		//System.out.println(" CharCounter : do line counting"+fileContent.toString()) ;
		lineCount=fileContent.toString().split("\n").length;
		
		
		for (int i = 0; i < fileContent.length(); i++) {
	         if (Character.isLetter(fileContent.toString().charAt(i)))
	        	 
	        	 charCount++;
	      }
		
	  System.out.println("-");
      System.out.println("No of Chars	 "+charCount);
    
	}
	

}
