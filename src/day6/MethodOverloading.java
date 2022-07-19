package day6;

public class MethodOverloading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	void add(double a,double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(1, 1);
		obj.add(1.1,2.2);
		obj.add(1, 1, 1);
	}

}
