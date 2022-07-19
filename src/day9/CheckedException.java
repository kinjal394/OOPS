package day9;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("prorame started");
		
		// 1 type
		Thread.sleep(5000);
		
		//2 type
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program end");

	}

}
