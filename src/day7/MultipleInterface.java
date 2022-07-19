package day7;

interface abcd{
	int x=100; // final or static
	void m1(); // default public 
}

interface xyz{
	int y=200;
	void m2();
}

public class MultipleInterface implements abcd,xyz {
	
	public void m1() {// default
		System.out.println("first interface"+x);
	}
	public void m2() {
		System.out.println("second interface"+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface MM=new MultipleInterface();
		MM.m1();
		MM.m2();
	}

}
