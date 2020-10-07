import java.util.ArrayList;

public interface IParser {
	
	public void parse();
	public String getIsHelpRequested();
	public String getIsBannerRequested();
	public String getIsVerbose();
	public ArrayList<String> getArgsArray();
	public ArrayList<String> getCommandsArray();
}
