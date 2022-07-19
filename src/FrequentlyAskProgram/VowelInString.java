	package FrequentlyAskProgram;

public class VowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";
		s.toLowerCase();
		
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			count=0;
			switch (s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
			if(count==1)
				System.out.println(s.charAt(i));
		}

	}

}
