package FrequentlyAskProgram;

import java.util.HashSet;

public class StringDuplicateFind {

	public static void main(String[] args) {
		//approach 1
		String a[]= {"java","c#","php","sql","java"};
		boolean flag=false;
		int b=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Found duplicate element " + a[i]);
					flag=true;
				}
				
			}
		}
		if(flag==true) {
			System.out.println("Found duplicate element");
		}else {
			System.out.println("Not Found duplicate element");
		}
		
		//approach 2
		System.out.println("approach 2 using Hash Set");
		HashSet<String> h=new HashSet<String>();
		for(String r:a) {
			h.add(r);
			if(h.add(r)==false) {
				System.out.println("Found duplicate element");
			}
		}
		
		for(String e:h) {
			System.out.println(e);
		}
	}

}
