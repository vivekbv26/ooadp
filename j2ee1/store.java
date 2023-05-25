package j2ee1;

public class store {
	int prevsales;
	store(int prevsales){
		this.prevsales= prevsales;
	}
	double offer() {
		if(this.prevsales<=1000) {
			return 0.9;
		}
		else if(this.prevsales>1000 && this.prevsales<2000) {
			return 0.8;
		}
		else {
			return 0.7;
		}
	}

}
