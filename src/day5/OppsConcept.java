package day5;



class emp{
	int id;
	String name;
	double salary;
	void dispaly() {
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
	}
}

public class OppsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp obj=new emp(); // referance variable
		obj.id=1;
		obj.name="kinjal";
		obj.salary=5000.59;
		obj.dispaly();
	}

}
