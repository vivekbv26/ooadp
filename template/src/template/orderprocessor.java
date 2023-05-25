package template;

public  abstract class orderprocessor {
	public final void processorder() {
		selectitem();
		dodelivery();
		dopayment();
		
	}
	public abstract void selectitem();
	public abstract void dodelivery();
	public abstract void dopayment();
	

}
