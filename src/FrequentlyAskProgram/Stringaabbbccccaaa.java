package FrequentlyAskProgram;

import java.util.Scanner;

public class Stringaabbbccccaaa {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("enter string like aabbbcccc ");
		
		String s=st.nextLine(); //"abbcccdddd";
		System.out.println(s);
		char temp=s.charAt(0);
		int count=0;
		String rev="";
		int len=s.length();

		for(int i=0;i<len;i++) {
			if(s.charAt(i)==temp) {
				count++;
				rev =rev+s.charAt(i);
				if(i==len-1) {
					rev =rev+count;
				}
			}else {
				temp=s.charAt(i);
				rev = rev+count+s.charAt(i);
				count=1;
			}
		}
		System.out.println(rev);
	}

}
