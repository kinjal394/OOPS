package TechnicalInterview;

public class PalindromNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,sum=0;
		
		int num=454;
		int temp=num;
		while(num>1) {
			x=num%10;
			num=num/10;
			sum =sum*10+x;
		}
		
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("this is palindrom");
		}else
			System.out.println("this is not palindrom");
	}

}
