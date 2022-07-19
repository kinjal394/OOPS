package day7;

//method overloading
//method should be same 
//body should be change
class bank{
	float getBankIntersetRat() {
		float rate=10.33f;
		return rate;
	}
}

class ICICbank extends bank{
	float getBankIntersetRat() {
		float rate=22.33f;
		return rate;
	}
}

class SBIBank extends bank{
	float getBankIntersetRat() {
		float rate=42.33f;
		return rate;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		ICICbank oIcic=new ICICbank();
		System.out.println(oIcic.getBankIntersetRat()); 
		
		SBIBank osbi=new SBIBank();
		System.out.println(osbi.getBankIntersetRat()); 
	}

}
