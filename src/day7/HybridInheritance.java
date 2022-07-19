package day7;

class eee{
	int x=10;
	void m1() {
		System.out.println(x);
	}
}

interface bbb{
	int y=20;
	void m2();
}

interface ccc{
	int z=20;
	void m3();
}

public class HybridInheritance extends eee implements bbb,ccc{
	public void m2() {
		System.out.println(y);
	}
	public void m3() {
		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridInheritance obj=new HybridInheritance();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
