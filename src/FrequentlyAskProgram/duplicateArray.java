package FrequentlyAskProgram;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a=new int[5];
		int a[]= {6,7,8,9,9,3,4,5,6,1,2,3,4,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nAfter removing duplicates:");
		int b=0;
		a[b]=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[b]!=a[i]) {
				b++;
				a[b]=a[i];
			}
		}
		
		for(int i=0;i<=b;i++) {
			System.out.println(a[i]);
		}
	}

}
