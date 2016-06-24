/* IStudentDao.java */
package dao;

import java.util.HashMap;
import java.util.List;

public interface IStudentDao {
	public static final String STUDENT_ID = "id";
	public static final String STUDENT_NAME = "name";
	public static final String STUDENT_GRADE = "grade";
	public static final String STUDENT_ORG_ID = "orgId";
	
	public int insert(HashMap<String, Object> t);
	public int delete(HashMap<String, Object> t);
	public int update(HashMap<String, Object> params);
	public List<HashMap<String, Object>> select(HashMap<String, Object> t);
}
