package observer;

public class main {
	public static void main(String[] args) {
	store s1 = new store("store1",10);
	store s2 = new store("store2",20);
	customer c1 = new customer(s1,"modi");
	customer c2 = new customer(s2,"rahul");
	s1.setdiscount("holi",5);
	s1.unregister(c2);
	s1.setdiscount("diwali", 20);
	
	customer c3 = new customer(s1,"raga");
	s1.setdiscount("ugadi", 15);
	}

}
