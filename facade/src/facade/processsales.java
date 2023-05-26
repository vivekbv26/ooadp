package facade;
import java.util.*;

public class processsales {
	boolean gift;
	float amount;
	int qty;
	public processsales(boolean g,float a, int q) {
		gift = g;
		amount =a;
		qty=q;
		
	}
	
	void process() {
		if(!gift) {
			System.out.println("no gift card");
			System.out.println("amount payable"+amount);
			
		}
		else{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the gift card value");
			float value = sc.nextFloat();
			if(qty<0) {
				System.out.println("no items in cart");
			}
			else if(qty>1) {
				System.out.println("only one item can be purschaded using gift item");
				
				
			}
			else if(amount>value) {
				System.out.println("please pay this much"+(amount-value));
				
			}
			else if(amount<=value) {
				System.out.println("no cashback will be privided");
			}
			
		}
	}

}
