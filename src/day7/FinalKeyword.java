package day7;
class Bike{
	final int speed=40;// final variable so we can not change this value
	 void run() {
		System.out.println("running---------");
	}
}

class Honda extends Bike{
	 void run() {
		System.out.println("running---------");
	}
}

public class FinalKeyword {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda f=new Honda();
		System.out.println(f.speed);
		f.run();
	}

}
