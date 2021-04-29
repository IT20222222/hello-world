package Ex2;
import java.util.*;

class Student{
	String studentID;
	String name;
	double GPA;
	
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
		ArrayList<Student> myArrayList = new ArrayList<Student>();
		
		myArrayList.add(new Student("IT2020", "Shehan", 3.6));
		myArrayList.add(new Student("IT2021", "Amila", 2.6));
		myArrayList.add(new Student("IT2022", "Anjula", 3.8));
		
		for(Student s : myArrayList) {
			System.out.println("ID : " + s.getStudentID());
			System.out.println("Name : " + s.getName());
			System.out.println("GPA : " + s.GPA);
			
		}
	}

}
