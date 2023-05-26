package bridge;

public class firstime extends customer {
	public firstime(discount dis) {
		super(dis);
	}
	public double getdiscountedprice(double amount) {
		return dis.caldis(amount);
	}

}
