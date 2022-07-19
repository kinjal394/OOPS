package day5;

public class Students {
	int studentId;
	String name;
	char grad;
	int sub1;
	int sub2;
	int sub3;
	
//	Students(int id, String Name, char G) {
//		studentId=id;
//		name=Name;
//		grad=G;
//	}
	
	void getValue(int id, String Name, char G) {
		studentId=id;
		name=Name;
		grad=G;
	}
	void display() {
		System.out.println(studentId +" " + name + " "+ grad);
	}
	
	void getStudentData(int sid,String sname) {
		studentId=sid;
		name=sname;
		System.out.println(studentId + " "+name);
	}
	
	void getStudentMark(int subject1, int subject2, int subject3) {
		sub1=subject1;
		sub2=subject2;
		sub3=subject3;
		System.out.println(sub1 + " "+sub2 + " "+sub3);
	}
	
	int TotalMark(int s1,int s2,int s3) {
		return s1+s2+s3;
	}
}
