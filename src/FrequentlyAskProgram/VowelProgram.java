package FrequentlyAskProgram;

import java.util.Scanner;

public class VowelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers of charachters");
		char ch=s.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			i++;
		}
		if(i==1) {
			System.out.println("this is vowel  " + ch );
			System.out.println(i);
		}else {
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				System.out.println("this is consonent " +ch);
			}else {
				System.out.println("Not an alphbet");
			}
		}

	}

}
