package day4;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][2]; // 3 is row and 2 is colums
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		//int b[][]= {{100,200},{300,400},{500,600}};
		System.out.println("number of rows"+a.length);
		System.out.println("number of colums"+a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("-------------");
		for (int r[]:a) {
			for(int c:r) {
				System.out.println(c);
			}
		}
	}

}
