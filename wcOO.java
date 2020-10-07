import java.io.BufferedReader;

public class wcOO {
	
	public void doCounting(String command, String fileName,StringBuilder fileContent){
		//filename
		//print filename
		//System.out.println("wcOO ::: doCounting " +command +" "+fileName );
		//System.out.println("wcOO ::: doCounting " +fileContent.toString());
		
	
		CounterFactory cf=new CounterFactory();
		
		ICounter fileOperation = cf.createCounter(command);
		fileOperation.doCounting(fileContent);
		

		
		
		
	}

}
