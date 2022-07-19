package FrequentlyAskProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=20,b=30;
		//logic 1
			int temp=a;
			a=b;
			b=temp;
			
		//logic 2
			a=a+b;
			b=a-b;
			a=a-b;
			
		//logic 3 here a and b value should not be 0
			a=a*b;
			b=a/b;
			a=a/b;
		
		System.out.println("Value of a="+a + " & " + "Value of b =" + b);

	}

}
