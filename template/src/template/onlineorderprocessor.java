package template;

public class onlineorderprocessor extends orderprocessor {

	@Override
	public void selectitem() {
		
		System.out.println("Online: Displaying tabular price comparison.");
	}

	@Override
	public void dodelivery() {
		
		 System.out.println("Online: Processing net-banking payment.");
	}

	@Override
	public void dopayment() {
		System.out.println("Online: Pay shipping charges and provide delivery address.");
		
	}
	

}
