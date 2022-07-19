package JavaBasic;

public class oprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic
		int a=10, b=20;
		System.out.println("sum of two value is ="+(a+b));
		
		//relational operators
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a!=b);
		//logical operator
		System.out.println("logical operator");
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println("incremental operator");
		int i=1;
		System.out.println(i++);
		System.out.println(i--);
		
		//assigmment 
		System.out.println("assigmment  a==b");
		
		System.out.println("swap two number");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("value of a after swap"+ a +" "+"value of b after swap"+b);
				
		

	}

}
