package TechnicalInterview;

public class LeftRotaionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int numofRotaion=2;
		int first;
		
		for(int i=0;i<numofRotaion;i++) {
			first= a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		
		for(int r:a) {
			System.out.print(r +",");
		}

	}

}
