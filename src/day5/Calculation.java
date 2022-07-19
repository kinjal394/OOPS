package day5;

public class Calculation {
	int x=20;
	int y=30;
	
	//not taking parameter and not return any value
	void sum() {
		System.out.println(x+y);
	}
	
	//not taking parameter but returning value
	int mul() {
		return x*y;
	}
	
	//taking parameter but not returning value
	void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	//by taking parameter and returing value
	int addition(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj= new Calculation();
		obj.sum();
		int multiplicaion=obj.mul();
		System.out.println(multiplicaion);
		obj.sub(20, 10);
		int addition=obj.addition(40, 50);
		System.out.println(addition);
	}

}
