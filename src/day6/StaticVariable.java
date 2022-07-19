package day6;

public class StaticVariable {
	
	static int a=10;// static variable and method no need to create a object
	int b=19;
	
	static void m1() {
		System.out.println("static method");
	}
	
	void m2() {
		System.out.println("non static method");
	}
	
	void m3() {// non satic method can access static method and variable
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		StaticVariable o=new StaticVariable();
		o.m3();
	
	}

}
