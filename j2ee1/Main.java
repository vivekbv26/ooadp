package j2ee1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bill amount");
		int amt = sc.nextInt();
		System.out.println("enter the type of ci=usteomer");
		String customertype = sc.next();
		customer obj = null;
		switch(customertype) {
		case "r":{
			obj = new regular();
			break;
		}
		case "s":{
			obj = new senior();
			break;
		}
		case "f":{
			obj = new firstime();
			break;
		}
		}
		System.out.println("amount before discount");
		System.out.println(amt);
		System.out.println("amount after customer discout");
		System.out.println(obj.amtafterdis(amt));
		System.out.println("enter sales of previous day");
		int prev = sc.nextInt();
		store str = new store(prev);
		System.out.println("amount after store discout");
		System.out.println(obj.amtafterdis(amt)* str.offer());
		sc.close();
	}
	

}
