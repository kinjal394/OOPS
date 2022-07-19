package FrequentlyAskProgram;

import java.util.ArrayList;

public class PrimeAmezon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		
		String Primenum="";
		for(int i=1;i<100;i++) {
			int count=0;
			for(int num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				Primenum=Primenum+i+ ",";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(Primenum);
	
	}

}
