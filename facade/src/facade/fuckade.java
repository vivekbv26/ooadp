package facade;

public class fuckade {
	itempurchased i;
	processsales s;
	
	public fuckade(boolean b,float a) {
		i = new itempurchased();
		s= new processsales(b,a,i.gettypecount());
	}
	
	void displayitems() {
		i.showitems();
	}
	void displayamount() {
		s.process();
	}
	
	

}
