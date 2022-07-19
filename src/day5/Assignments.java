package day5;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students();
		obj.getStudentData(120060, "kinjal");
		obj.getStudentMark(50, 40, 10);
		int total=obj.TotalMark(50, 40, 10);
		System.out.println(total);
	}

}
