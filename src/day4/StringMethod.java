package day4;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome";
		String s2=" To Java";
		System.out.println("length "+s1.length());
		System.out.println("concat "+ s1.concat(s2)); // combine two string
		System.out.println("trim "+ s2.trim()); // remove space left and right side
		System.out.println("charAt "+ s1.charAt(2));// get char at index
		System.out.println("contains "+ s1.contains("Wel")); //in squeance characters are in the string or not
		System.out.println("equals "+ s1.equals(s2)); // match string
		System.out.println("equalsIgnoreCase " + s1.equalsIgnoreCase("WELCOME")); // uperr or lower case any way
		System.out.println("Replace "+ s1.replace('o', 't'));
		System.out.println(s2.replace("To", "YY"));
		
		String s4="testing selenium";// starting for 0 index and ending with 1 index
		String substring=s4.substring(3, 6);
		System.out.println(substring);
		
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());

	}

}
