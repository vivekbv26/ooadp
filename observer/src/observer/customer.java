package observer;

public class customer extends observer {
	subject s;
	float discount;
	String name;
	public customer(subject s,String name) {
		this.name = name;
		s = s;
		s.register(this);
	}

	@Override
	void update(float discount) {
		this.discount= discount;
		System.out.println(name+"you get a discount of"+discount+"%");
		
		
	}
	public String toString() {
		return name;
		
	}
	
	

}
