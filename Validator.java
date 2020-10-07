
public class Validator {
	
	public static final String[] OPTIONS_ARRAY = {"?","H", "V", "B", "HELP","BANNER","VERBOSE"};
	public static final String[] COMMANDS_ARRAY = {"CHAR","WORD","LINE"};
	
	
	public boolean isValidOption(String option) {
		
		for(String op : OPTIONS_ARRAY) {
			//System.out.println(op);
			if (option.equalsIgnoreCase(op)){
				
				
				return true;
			}
		}
		
		
		return false;
	}

public boolean isValidCommand(String option) {
		
		for(String op : COMMANDS_ARRAY) {
			if (option.equalsIgnoreCase(op)){
				//valid options
				return true;
			}
		}
		
		
		return false;
	}

}
