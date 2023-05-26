package bridge;

public class main {
	public static void main(String[] args) {
		customer sc = new seniorcitizen(new discount30()); 
		double amt = sc.getdiscountedprice(100);
		System.out.println(amt);
		customer rc = new regularcustomer(new discount20());
		double amount = rc.getdiscountedprice(100);
		System.out.println(amount);
		customer fc = new firstime(new discount15());
		double am = fc.getdiscountedprice(100);
		System.out.println(am);
		
	}

}
