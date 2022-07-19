package FrequentlyAskProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using string concatenation
		String s="Kinjal";
		String Revers="";
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			Revers =  c + Revers ;
		}
		System.out.println(Revers);
		
		
		//using character Array
		String cRevers=""
				;
		String k="wlcome to canada";
		char c[]=k.toCharArray();
		for(int i=0;i<c.length;i++) {
			cRevers =  c[i] + cRevers ;
		}
		System.out.println(cRevers);
		
		
		//using StringBuffer
		StringBuffer bf=new StringBuffer(k);
		System.out.println(bf.reverse());
		
	}

}
