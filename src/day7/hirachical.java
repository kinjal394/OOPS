package day7;

class parent{
	int a;
	void pritn() {
		System.out.println(a);
	}
}

class child extends parent{
	int b;
	void show() {
		System.out.println(b);
	}
}

class child2 extends child{
	int c;
	void showc() {
		System.out.println(c);
	}
}
public class hirachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child2 obj=new child2();
		obj.a=100;
		obj.b=200;
		obj.c=300;
		obj.pritn();
		obj.show();
		obj.showc();
	}

}
