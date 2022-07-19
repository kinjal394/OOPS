package day7;

class a{
	int a=10;
	void printa() {
		System.out.println(a);
	}
}

class b extends a{
	int b=20;
	void printb() {
		System.out.println(b);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj=new b();
		obj.printa();
		obj.printb();
	}

}
