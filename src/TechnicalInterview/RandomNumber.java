package TechnicalInterview;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=400;
		int min=200;
		System.out.println("1 st Random number "+ Math.random()*(max-min+1)+min);
		System.out.println("2 st Random number "+ Math.random()*(max-min+1)+min);
		System.out.println("3 st Random number "+ Math.random()*(max-min+1)+min);
		
		Random rm=new Random();
		rm.nextFloat();
		System.out.println(rm.nextFloat());

	}

}
