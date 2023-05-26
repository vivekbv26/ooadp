package adapter;

public class main {
	public static void main(String[] args) {
		mauritax m = new mauritax();
		taxcalculator t  = new mauritaxadapter(m);
		double amount = 1000;
		double tax = t.calculatetax(amount);
		System.out.println("the tax amount is "+tax);
		
		
	}

}
