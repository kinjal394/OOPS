package FrequentlyAskProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionInTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="xyztt";
		String s2="yzopuu";
		
		//char a[]=new char[s1.length()+s2.length()];
		ArrayList a=new ArrayList();
		HashSet hs=new HashSet();
		
		for(int i=0;i<s1.length();i++) {
			hs.add(s1.charAt(i));
		}
		
		for(int i=0;i<s2.length();i++) {
			hs.add(s2.charAt(i));
		}
		
		
//		for(int i=0;i<a.size();i++) {
//			for(int j=i+1;j<a.size();j++) {
//				if(a.get(i)==a.get(j)) {
//					a.remove(j);
//				}
//			}
//		}
//		
		
	
		
		StringBuffer sb=new StringBuffer();
		for(Object t:hs) {
			sb.append(t);
		}
		System.out.println(sb.toString());
	}

};
