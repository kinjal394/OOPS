package day7;

 interface abc{
	int a=1;//by default static or final we can not change
	 void m1(); // abstract method, default public 
}

public class InterfaceClass implements abc {
		public void m1(){
			System.out.println("interface method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj=new InterfaceClass();
		obj.m1();
		
		//abc o=new InterfaceClass();
	}

}
