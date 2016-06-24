/* Student.java */
package SpringStudy002.bean;

public class Student {
	private String id;
	private String name;
	private Integer grade;

	public String getId() {
		return id;
	}
	public Student setId(String id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Integer getGrade() {
		return grade;
	}
	public Student setGrade(Integer grade) {
		this.grade = grade;
		return this;
	}
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + grade;
	}
}