package day5;

public class ParametConstructor {
	int x,y;
	ParametConstructor() {// default coustructor
		 x=10;
		y=20;
	}
	
	ParametConstructor(int a, int b){ // parametrize cons
		x=a;
		y=b;
	}
	
	void dispaly() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametConstructor obj=new ParametConstructor();
		obj.dispaly();
		ParametConstructor obj1=new ParametConstructor(33,44);
		obj1.dispaly();
	}

}
