/* Service.java */
package service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IStudentDao;

@Service
public class StudentService {

	@Autowired
	private IStudentDao dao;

	//1. 학생 정보 리스트를 DB에서 받아오는 기능
	public List<HashMap<String, Object>> getStudentList(HashMap<String, Object> student){
		if(student==null)
			student = new HashMap<String, Object>();
		return dao.select(student);
	}
	//2. 학생 정보 하나를 추가하는 기능
	public int addStudent(HashMap<String, Object> student){
		return dao.insert(student);
	}
	//3. 학생 정보 하나를 수정하는 기능
	public int modifyStudent(HashMap<String, Object> student){
		return dao.update(student);
	}
	//4. 학생 정보 하나를 지우는 기능
	public int deleteStudent(HashMap<String, Object> student){
		return dao.delete(student);
	}
}