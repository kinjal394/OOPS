package TechnicalInterview;

public class PrimeNumber {
	
	public static void checkPrime(int number) {
		int flag=0;
		int count1=0;
		for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count1++;
				}
		}
		if(count1==2) {
			System.out.println("prime numbers");
		}else {
			System.out.println(" not prime numbers");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="";
		for(int i=1;i<100;i++) {
			count=1;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					count++;
					
				}
				
			}
			if(count==2) {
				s=s+i+",";
			}
			
		}
		System.out.println(s);
		checkPrime(6);
		

	}
	
	

}
