package mockito_basics;

public class MathService {
	Calc c;
	
	MathService(Calc c){
		this.c=c;
	}
	
	public int doubAdd(int a,int b) {
		return 2*c.add(a,b);
	}
}
