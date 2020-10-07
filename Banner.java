
public class Banner implements IBanner {
	
	String progName="PROGRAM NAME: ";
	String version="Version: "  ;
	String copyRight="Copyright : ";
	String author=null;
	
	
	public Banner(String progName, String version,  String copyRight, String author ){
		
		this.progName=this.progName +" " +progName;
		this.version=this.version +" " + version;
		this.copyRight=this.copyRight+" "+copyRight;
		this.author=author;
		
	}

	@Override
	public void printBanner() {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------");
		System.out.println(progName);
		System.out.println(version);
		System.out.println(copyRight);
		System.out.println(author);
		System.out.println("--------------------------------");
		
	
		

	}

}

