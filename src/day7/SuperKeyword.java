package day7;

//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method 
//super  can be used to invoke immediate parent class constructor 
class animal{
	String color="white";
	void eating() {
		System.out.println("Eating---------");
	}
}

class dog extends animal{
	String color="Black";
	void dispaly() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void eating() {
		System.out.println("eating bread");
		super.eating();
	}
}
public class SuperKeyword {
	public static void main(String arg[]) {
		dog d=new dog();
		d.dispaly();
		d.eating();
	}
}
