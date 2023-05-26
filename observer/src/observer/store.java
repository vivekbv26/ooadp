package observer;
import java.util.ArrayList;
public class store extends subject{
	float discount;
	String name;
	
	ArrayList<observer> o1;
	
	public store(String name, float discount) {
		this.name = name;
		this.discount = discount;
		o1 = new ArrayList<observer>();
	}
	
	void register(observer o) {
		o1.add(o);
		System.out.println("added customer"+o+"to store"+name);
	}
	void unregister(observer o) {
		o1.remove(o);
		System.out.println("removed customer"+o+"from store"+name);
	}
	void notifyobservers() {
		for(observer o:o1) {
			o.update(discount);
		}
	}
	void setdiscount(String festival,float d) {
		discount = d;
		System.out.println("new discount offer of "+festival);
		notifyobservers();
	}
	

}
