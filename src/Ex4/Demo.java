package Ex4;
import java.util.*;

import Ex2.Student;

class Student{
	private String studentID;
	private String name;
	private double GPA;
	
	public Student(String studentID, String name, double gPA) {
		super();
		this.studentID = studentID;
		this.name = name;
		GPA = gPA;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<String, Student>();
		
		Student s1 = new Student("IT2020", "Shehan", 3.6);
		Student s2 = new Student("IT2021", "Amila", 2.6);
		Student s3 = new Student("IT2022", "Anjula", 3.8);
		
		map.put(s1.getStudentID(), s1);
		map.put(s2.getStudentID(), s2);
		map.put(s3.getStudentID(), s3);
		
		for(Map.Entry<String,Student> entry : map.entrySet()) {
			String key = entry.getKey();
			Student s = entry.getValue();
			System.out.println("ID : " + s.getStudentID());
			System.out.println("Name : " + s.getName());
			System.out.println("GPA : " + s.getGPA());
		}
	}

}
