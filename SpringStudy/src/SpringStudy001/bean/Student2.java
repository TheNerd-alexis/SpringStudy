/* Student2.java */
package SpringStudy001.bean;

public class Student2 {
	private String id;
	private String name;
	private int grade;
	
	public Student2(String id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "student2: " + id + "\t" + name + "\t" + grade;
	}
}