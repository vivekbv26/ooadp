package bridge;

public class seniorcitizen extends customer {

	public seniorcitizen(discount dis) {
		super(dis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getdiscountedprice(double amount) {
		// TODO Auto-generated method stub
		return dis.caldis(amount);
	}

}
