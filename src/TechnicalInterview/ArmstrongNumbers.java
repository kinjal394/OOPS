package TechnicalInterview;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=371;
		int x;
		int sum=0;
		
		while(num>1) {
			x=num%10;
			num=num/10;
			
			sum += x*x*x;
		}
		
		System.out.println(sum);
		if(num==sum) {
			System.out.println(num + "this number is armstrongs ");
		}else {
			System.out.println(num + "this number is not armstrongs ");
		}

	}

}
