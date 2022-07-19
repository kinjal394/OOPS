package day6;

public class ThisKeyword {
	
	int a,b;// class variable
	void sum(int a,int b) { //method vriable
		this.a=a;// every varable need same space . same varable not need extra space
		this.b=b;
		
	}
	
	void printValue() {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
	ThisKeyword obj=new ThisKeyword();
	obj.sum(10, 20);
	obj.printValue();

	}

}
