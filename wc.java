import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class wc {

	static HashMap<String, BufferedReader> fileContent = new HashMap<String, BufferedReader>();
	static String isVerbose="N";
	


	public static void main(String[] args) {

		String isBannerRequest = "N";
		String isHelpRequest = "N";
	    HelpFiles hf = new HelpFiles();
		
		ArrayList<String> fileNames = new ArrayList<String>();
		
		ArrayList<String> commandNames = new ArrayList<String>();
		ArrayList<String> goodFileNames = new ArrayList<String>();

		IParser parseIt = new Parser(args);



		IBanner banner = new Banner("File Count Operations", "beta", "2020", "Suhel Firdus");

		isBannerRequest = parseIt.getIsBannerRequested();
		isVerbose=parseIt.getIsVerbose();

		if ("Y".equals(isBannerRequest)) {
			banner.printBanner();

		}
		isHelpRequest = parseIt.getIsHelpRequested();
		if ("Y".equals(isHelpRequest)) {
			
			hf.printHelp();

		}

		// need all the filenames here

		fileNames = parseIt.getArgsArray();
		goodFileNames = fileNames;
	

		commandNames = parseIt.getCommandsArray();

		if (commandNames.isEmpty() && !fileNames.isEmpty()) {
			//System.out.println("command array is empty");
			commandNames.add("word");
			commandNames.add("char");
			commandNames.add("line");

		}
		
		if (!commandNames.isEmpty() && fileNames.isEmpty()) {
			System.out.println("File name must be specifiEd !! ERROR !! See Usage");
			if (isHelpRequest=="N")
			          hf.printHelp();
		}
		


		for (String fn : goodFileNames) {
			System.out.println("-----------------------------------  FILE NAME : " + fn+" -----------------------------------" );
			StringBuilder fileContent =getFileReader(fn);

			for (String comm : commandNames) {
				//System.out.println("Parsed Command  :  " + comm + " " + fn);
                try {
				processCommand(comm, fn, fileContent);
                }catch(Exception e) {
                	System.out.println("Cannot Proceed for this File.Has Error .");
                }
			}
			System.out.println("-------------------------" );

		}
		

	}

	static StringBuilder getFileReader(String filePath) {
		System.out.println("-"); 
		System.out.println("location:  " + System.getProperty("user.dir"));
		//System.out.println("-"); 
		//System.out.println("get file reader");
		StringBuilder stringBuilder = new StringBuilder();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			
			String line = null;
			String ls = System.getProperty("line.separator");
			
			try {
				while ((line = reader.readLine()) != null) {
					stringBuilder.append(line);
					stringBuilder.append(ls);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}

			
			//System.out.println(stringBuilder.toString());
			
			
			try {
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			String content = stringBuilder.toString();

		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
			stringBuilder=null;
		}

		
		return stringBuilder;

	}

	static void processCommand(String command, String filePath, StringBuilder fileContent) {

		//System.out.println("Issuing command to wcOO : ");

		//System.out.println(command + " " + filePath);
		wcOO wc1 = new wcOO();
		
		if (isVerbose=="Y") {
			System.out.println("*********");
			System.out.println("Executing command on " + " " + filePath);
			
		}

		wc1.doCounting(command, filePath, fileContent);
	}

}
