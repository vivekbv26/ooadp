package factory;

public class factory {
	public customer category(String ptype) {
		if(ptype.equalsIgnoreCase("teen")) {
			return  new teen();
		}
		
		else if(ptype.equalsIgnoreCase("aged")) {
			return new aged();
			
		}
		else if(ptype.equalsIgnoreCase("kids")){
			return new kids();
		}
		return null;
		
		
	}

}
