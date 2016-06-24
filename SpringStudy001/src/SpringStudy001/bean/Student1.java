/* Student1.java */
package SpringStudy001.bean;

public class Student1 {
	private String id;
	private String name;
	private int grade;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "student1: " + id + "\t" + name + "\t" + grade;
	}
}