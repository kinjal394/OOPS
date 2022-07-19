package JavaBasic;

public class JumpingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=10;i++) {
				if(i==5) {
					break;
				}
				System.out.println(i);
				
			}
			System.out.println("continue loop");
			for(int j=1;j<=10;j++) {
				if(j==5 || j==2) {
					continue;
				}
				System.out.println(j);
			}
	}

}
