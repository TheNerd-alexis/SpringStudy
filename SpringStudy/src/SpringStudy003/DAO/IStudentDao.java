/* IStudentDao.java */
package SpringStudy003.DAO;

import java.util.HashMap;
import java.util.List;

public interface IStudentDao {
	public int insert(HashMap<String, Object> t);
	public int delete(HashMap<String, Object> t);
	public int update(HashMap<String, Object> params);
	public List<HashMap<String, Object>> select(HashMap<String, Object> t);
}
