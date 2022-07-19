package TechnicalInterview;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=231453455;
		int x=0;
		int sum=0;
		
		while(num>1) {
			x=num%10;
			num=num/10;
			
			sum = sum*10+x;
			
		}
		
		System.out.println(sum);

	}

}
