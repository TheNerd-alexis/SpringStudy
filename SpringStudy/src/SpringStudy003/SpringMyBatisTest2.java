/* SpringMyBatisTest.java */
package SpringStudy003;

import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringStudy003.DAO.IStudentDao;

public class SpringMyBatisTest2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringStudy003/applicationContext.xml");
		IStudentDao studentDao = context.getBean("studentDao", IStudentDao.class);

		HashMap<String, Object> emptyMap = new HashMap<String, Object>();
		System.out.println(studentDao.select(emptyMap));
		
		HashMap<String, Object> student1 = new HashMap<String, Object>();
		student1.put("id", "200902133");
		student1.put("name", "Alexis");
		student1.put("grade", 98);
		
		HashMap<String, Object> student2 = new HashMap<String, Object>();
		student2.put("id", "201305075");
		student2.put("name", "Bob");
		student2.put("grade", 83);
		
		studentDao.insert(student1);
		studentDao.insert(student2);
		
		System.out.println(studentDao.select(emptyMap));
		
		HashMap<String, Object> orgStudent = new HashMap<String, Object>();
		orgStudent.put("id", "201305075");

		orgStudent = studentDao.select(orgStudent).get(0);
		HashMap<String, Object> newStudent = new HashMap<String, Object>();
		newStudent.put("id", "201305075");
		newStudent.put("name", "new Bob");
		newStudent.put("grade", 67);

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("student", newStudent);
		params.put("orgStudent", orgStudent);

		studentDao.update(params);
		System.out.println(studentDao.select(emptyMap));
		
		studentDao.delete(newStudent);
		System.out.println(studentDao.select(emptyMap));
	}
}
