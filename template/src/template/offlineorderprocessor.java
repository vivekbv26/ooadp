package template;

public class offlineorderprocessor extends orderprocessor {

	@Override
	public void selectitem() {
		 System.out.println("Offline: Trying out items in store.");
		
	}

	@Override
	public void dodelivery() {
		System.out.println("Offline: Paying through cash or card swipe.");
		
	}

	@Override
	public void dopayment() {
		System.out.println("Offline: Collect item at the counter.");
		
	}
	

}
