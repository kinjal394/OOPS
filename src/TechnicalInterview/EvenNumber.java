package TechnicalInterview;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		String odd="";
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				s=s+i+",";
			}else {
				odd=odd+i+",";
			}
		}
		
		System.out.println(s);
		System.out.println(odd);
	}

}
