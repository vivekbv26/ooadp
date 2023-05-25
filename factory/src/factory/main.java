package factory;

public class main {
	public static void main(String[] args) {
		customer c;
		factory f = new factory();
		c=f.category("teen");
		c= f.category("aged");
		c= f.category("kids");
	}

}
