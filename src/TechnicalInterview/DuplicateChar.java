package TechnicalInterview;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="red fish blue fish";
		int count=0;
		char letter;
		char ch;
		
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
					ch='*';
					ch=s.charAt(j);
	                System.out.println(ch);
				}
			}
			if(count>1)
				System.out.println(s.charAt(i));
		}
		
		System.out.println("------------------------------------------------------");
		for(int j=0;j<s.length();j++) {
			System.out.println(s.charAt(j));
		}

	}

}
