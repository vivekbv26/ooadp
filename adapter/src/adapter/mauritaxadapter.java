package adapter;

public class mauritaxadapter implements taxcalculator {
	private mauritax m;
	public mauritaxadapter(mauritax m) {
		this.m=m;
	}

	@Override
	public double calculatetax(double amount) {
		// TODO Auto-generated method stub
		return m.getvat(amount);
	}
	
	

}
