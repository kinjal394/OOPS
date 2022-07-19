package TechnicalInterview;
///25, 76 are automorphic numbers because their square is 625 and 5776, respectively 
//and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
//int a=1234;
//System.out.print(String.valueOf(a).substring(2));
public class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=76;
		int mulNum=num*num;
	
		int lastDigits;
		int lang=Integer.toString(mulNum).length();
		
		if(num<=9) {
			 lastDigits=Integer.parseInt(String.valueOf(mulNum).substring(1));
		}else {
			 lastDigits=Integer.parseInt(String.valueOf(mulNum).substring(lang-2,lang));
			// System.out.println(lastDigits);
		}
		
		
		//System.out.println(String.valueOf(mulNum).substring(lang-2,lang));
		
		
//		
//		while(num>1) {
//			
//			count++;
//			
//			x=mulNum%10;
//			mulNum=mulNum/10;
//			
//			sum=x+""+sum;
//			if(count==2) {
//				break;
//			}
//			
//			
//		}
		
		//int val=Integer.parseInt(sum);
		
		if(lastDigits==num) {
			System.out.println(num+ " this is automorphic numbers");
		}else {
			System.out.println(num+ " this is not automorphic numbers");
		}

	}

}
