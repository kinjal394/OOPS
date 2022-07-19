package day6;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a,int b) {
		System.out.println(a+b);
	}
	ConstructorOverloading(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj=new ConstructorOverloading(1);
		//ConstructorOverloading o=new ConstructorOverloading(3,2);
	}

}
