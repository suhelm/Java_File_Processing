
public class CounterFactory {
	
	
	public ICounter createCounter(String command) 
    { 
        if (command == null || command.isEmpty()) 
            return null; 
        if ("line".equals(command)) { 
            return new LineCounter(); 
        } 
        else if ("word".equals(command)) { 
           return new WordCounter(); 
       } 
        else if ("char".equals(command)) { 
            return new CharCounter(); 
       } 

        return null; 
    } 
	

}
