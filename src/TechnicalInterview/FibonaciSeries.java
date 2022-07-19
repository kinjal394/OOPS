package TechnicalInterview;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// output= 0,1,1,2,3,5,8,13
		int i=1;
		int t1=0,t2=1;
		int t3=t1+t2;
		String s=t1+","+t2+","+t3;
		while(i<10) {
			
			t1=t2;
			t2=t3;
			
			t3=t1+t2;
			s=s+","+t3;
			i++;
		}
	
		
		System.out.println(s);

	}

}
