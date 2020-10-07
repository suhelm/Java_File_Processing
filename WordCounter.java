import java.io.BufferedReader;
import java.io.IOException;

public class WordCounter implements ICounter {

	@Override

	
	public void doCounting(StringBuilder fileContent) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		//System.out.println(" WordCounter : do line counting"+fileContent.toString()) ;
		wordCount=fileContent.toString().split(" ").length;
		
		String[] words = fileContent.toString().split("\\s+");
		wordCount=words.length;
		System.out.println("-");
		System.out.println("No or Words:	" +wordCount);
		
		

		
	}
	

}

