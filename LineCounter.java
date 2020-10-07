import java.io.BufferedReader;
import java.io.IOException;

public class LineCounter implements ICounter {

	@Override

	
	public void doCounting(StringBuilder fileContent) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		//System.out.println(" do line counting"+fileContent.toString()) ;
		lineCount=fileContent.toString().split("\n").length;
		System.out.println("-");
		System.out.println("No of Lines: 	" +lineCount);
		
		
		

		
	}
	

}
