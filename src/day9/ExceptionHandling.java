package day9;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started");
		try {
			int x=50/0; // arithmetic exception
		} catch (Exception e) {
			System.out.println("enter in catch block");
		}
		finally{//•	Exception does not occur,Exception occurs and not handled,Exception occur and handled

			System.out.println("enter in final block");
		}
		
		
		String s=null;
		//System.out.println(s.length());// null pointer exception
		
		String m="abc";
		//int val= Integer.parseInt(m);
		
		int a[]=new int[10];
		//a[50]=10;

	}

}
