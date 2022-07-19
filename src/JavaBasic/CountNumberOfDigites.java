package JavaBasic;

public class CountNumberOfDigites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=424,count=0,sum=0;
		while(n!=0) {
			sum= sum + n%10;
			n=n/10;
			System.out.println(n);
			
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
