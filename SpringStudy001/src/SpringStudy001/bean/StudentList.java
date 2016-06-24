/* StudentList.java */
package SpringStudy001.bean;

public class StudentList {
	private int constructor;
	private Student1 student1;
	private Student2 student2;

	public StudentList() {
		this.constructor = 1;
	}
	public StudentList(Student1 student1, Student2 student2) {
		this.constructor = 2;
		this.student1 = student1;
		this.student2 = student2;
	}
	
	public Student1 getStudent1() {
		return student1;
	}
	public void setStudent1(Student1 student1) {
		this.student1 = student1;
	}
	public Student2 getStudent2() {
		return student2;
	}
	public void setStudent2(Student2 student2) {
		this.student2 = student2;
	}
	@Override
	public String toString() {
		return "constructor type: " + constructor + "\n[" + student1 + "]\n[" + student2 + "]";
	}
}