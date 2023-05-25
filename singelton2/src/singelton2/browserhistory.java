package singelton2;
import java.util.*;
public class browserhistory {
	private static browserhistory instance;
	private List<String> h;
	private browserhistory() {
		h = new ArrayList<>();
	}
	public static  browserhistory getinstance() {
		if(instance==null) {
			browserhistory instance = new browserhistory();
			return instance;
		}
		return instance;
		
	}
	public void visiturl(String url) {
		h.add(url);
	}
	public void displayurl() {
		for(String url:h) {
			System.out.print(url);
		}
		
	}
	
	

}
