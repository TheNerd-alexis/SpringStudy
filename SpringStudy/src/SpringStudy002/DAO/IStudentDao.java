/* IStudentDao.java */
package SpringStudy002.DAO;

import java.util.HashMap;
import java.util.List;

import SpringStudy002.bean.Student;

public interface IStudentDao {
	public int insert(Student t);
	public int delete(Student t);
	public int update(HashMap<String, Student> params);
	public List<Student> select(Student t);
}
