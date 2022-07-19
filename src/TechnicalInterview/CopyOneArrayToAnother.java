package TechnicalInterview;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,7,8,4,5,6};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int r:a) {
			System.out.println(r);
		}

	}

}
