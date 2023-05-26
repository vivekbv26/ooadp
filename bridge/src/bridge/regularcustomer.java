package bridge;

public class regularcustomer extends customer{
	
	public regularcustomer(discount dis) {
		super(dis);
	}

	@Override
	public double getdiscountedprice(double amount) {
		// TODO Auto-generated method stub
		return dis.caldis(amount);
	}
	

}
