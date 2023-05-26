package bridge;

public abstract class customer {
	discount dis;
	public customer(discount dis) {
		this.dis=dis;
	}
	public abstract double getdiscountedprice(double amount);
	

}
