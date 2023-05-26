































































package facade;
import java.util.*;
public class itempurchased {
	List<String>hm;
	int type ;
	public itempurchased() {
		hm = new ArrayList<String>();
		storepurchase();
	}
	public void storepurchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of items");
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the item names");
		for(int i=1;i<type;i++) {
			String s = sc.nextLine();
			hm.add(s);
		}
	}
	int gettypecount() {
		return type;
	}
	public void showitems() {
		for(String s:hm) {
			System.out.println(s);
			
		}
	}
	

}



















































































