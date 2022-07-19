package TechnicalInterview;

public class PositiveAndNagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first way using relation oprator
		
		int a=-10;
		
		
		if(a>0) {
			System.out.println("number is positive");
		}
		else if(a<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		
		//way 2 Java Math class provides the signum() method
		
		double result=Math.signum(a);
		System.out.println(result);

	}

}
