package TechnicalInterview;

public class FrequenceOfElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,2,3,55,6,7,8,55,6,666,77};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1)
				System.out.println(a[i]+" repetaed" + " : "+count + " times in array");
		}

	}

}
