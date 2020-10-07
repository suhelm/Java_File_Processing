
public class HelpFiles {
	
	public void printHelp() {
		System.out.println("--------------------------------");
		System.out.println("Help Manual");
		System.out.println("Usage : usage: wc  [comm] [-hbv] [file ...]");
		
		System.out.println("char : Character Count");
		System.out.println("word : Word Count");
		System.out.println("line : Line Count");
		System.out.println("- -");
		System.out.println("-h : Print Helps");
		System.out.println("-b : Print Banner");
		System.out.println("-v : Print Verbose output");
		System.out.println("- -");	
		
		System.out.println("- Example -");
		
		System.out.println(" wc  word -v  <file name(s)");
		System.out.println(" wc  char -vbh  <file name(s)");
		System.out.println(" wc  line -help -v -banner <file name(s)>");
		
		
		System.out.println("--------------------------------");
		
		
	}

}
