package FrequentlyAskProgram;



public class wordInStringAndUperCase {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="blue fish blue red fish";
	int count;
	
	str = str.toLowerCase();
	
	String words[]=str.split(" ");
	
	System.out.println("Duplicate word in string");
	for(int i=0;i<words.length;i++) {
		count=1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) {
				count++;
				words[j]="0";
			}
		}
		if(count>1 && words[i]!="0") {
			System.out.println(words[i]+ " no of words= "+ count);
		}else if(words[i]!="0") {
			System.out.println(words[i]+ " no of words= "+ count);
		}
		
	}
	
	System.out.println("-----------------------------");
	for(String s:words) {
		System.out.println(s);
	}
	
	System.out.println("-----------------------------");
	String news="Big black bug bit a big black dog on his big black nose";
	news=news.toLowerCase();
	
	String a[]=news.split(" ");

	for(int i=0;i<a.length;i++) {
		count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i].equals(a[j])) {
				count++;
				a[j]="0";
			}
		}
		if(count>1 && a[i]!="0")
			System.out.println(a[i]+count);
		else if(a[i]!="0")
			System.out.println(a[i]+count);
	}
	
	System.out.println("-----------------------------");
	for(String s:a) {
		System.out.println(s);
	}
}
}
