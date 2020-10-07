import java.util.ArrayList;

public class Parser implements IParser {

	String[] arg;
	String isHelpRequested = "N";

	String isBannerRequested = "N";
	String isVerbose = "N";
	String parseError = "Y";
	String stopParsingOptions = "N";

	ArrayList<String> optionArray = new ArrayList<String>();
	ArrayList<String> argsArray = new ArrayList<String>();
	ArrayList<String> commandsArray = new ArrayList<String>();

	Parser(String args[]) { // Constructor
		this.arg = args;
		parseOptions(this.arg);
		setVariables();


	}

	@Override
	public void parse() {
		// TODO Auto-generated method stub

	}

	public void parseOptions(String[] arg) {
		Validator vd = new Validator();
		String parsedOption = null;
		String wordOption = null;
		HelpFiles hm =new HelpFiles();

		if (arg.length == 0) {
			setIsHelpRequested("Y");
			setIsBannerRequested("Y");

		}

		for (String a : arg) {
			//System.out.println("Option Parser" + a);
			String substr = a.substring(0, 1);

			if ("-".equals(substr)) {

				if ("Y".equals(stopParsingOptions)) {
					// Stop Parsing options here- raise error
					System.out.println("Stop Parsing options raise error");
					setIsHelpRequested("Y");

					break;

				}

				wordOption = a.substring(1);
				//System.out.println("Option Parser" + wordOption);
				//System.out.println("word option check" + wordOption);
				if (vd.isValidOption(wordOption)) { // ENTIRE WORD IS A OPTION?
					//System.out.println("word option found - good option");
					optionArray.add(wordOption);
				} else {
					// parse letter by letter
					for (int i = 0; i < wordOption.length(); i++) {
						parsedOption = wordOption.substring(i, i + 1); // LETTER BY LETTER
						//System.out.println("Options are : " + wordOption.substring(i, i + 1));

						if (vd.isValidOption(parsedOption)) {
							//System.out.println("Valid Option- Add to Option List");
							optionArray.add(parsedOption);
						} else {
							System.out.println("Error Parsing Option :: Invalid Option/Command :  " + wordOption);
							hm.printHelp();
							optionArray.clear();
						}

					}

				}

			} else {
				// filename may be-Say arguments
				if (vd.isValidCommand(a)) {

					if (a.equals(arg[0])) {
						//System.out.println("specific command found");
						// this is a command
						commandsArray.add(a);
						stopParsingOptions = "N";
					} else {
						//System.out.println("command parsing error");
					}

				}
				if (!vd.isValidCommand(a)) {
					argsArray.add(a);
					stopParsingOptions = "Y";
				}
			}

		}

	}





	public void setVariables() {

		for (String o : optionArray) {
			if (o.equalsIgnoreCase("H") || o.equalsIgnoreCase("HELP")||o.equalsIgnoreCase("?")) {
				setIsHelpRequested("Y");
			}
			if (o.equalsIgnoreCase("V") || o.equalsIgnoreCase("VERBOSE")) {
				setIsVerbose("Y");
			}
			if (o.equalsIgnoreCase("B") || o.equalsIgnoreCase("BANNER")) {
				setIsBannerRequested("Y");
			}

		}

	}

	public String getIsHelpRequested() {
		return isHelpRequested;
	}

	public void setIsHelpRequested(String isHelpRequested) {
		this.isHelpRequested = isHelpRequested;
	}

	public String getIsBannerRequested() {
		return isBannerRequested;
	}

	public void setIsBannerRequested(String isBannerRequested) {
		this.isBannerRequested = isBannerRequested;
	}

	public String getIsVerbose() {
		return isVerbose;
	}

	public ArrayList<String> getArgsArray() {
		return argsArray;
	}

	public void setArgsArray(ArrayList<String> argsArray) {
		this.argsArray = argsArray;
	}

	public void setIsVerbose(String isVerbose) {
		this.isVerbose = isVerbose;
	}
	
	public ArrayList<String> getCommandsArray() {
		return commandsArray;
	}

}
