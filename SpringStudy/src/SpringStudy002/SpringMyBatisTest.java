/* SpringMyBatisTest.java */
package SpringStudy002;

import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringStudy002.DAO.IStudentDao;
import SpringStudy002.bean.Student;

public class SpringMyBatisTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringStudy002/applicationContext.xml");
		IStudentDao studentDao = context.getBean("studentDao", IStudentDao.class);

		Student emptyStudent = new Student();
		System.out.println(studentDao.select(emptyStudent));
		
		studentDao.insert(new Student().setId("200902133").setName("Alexis").setGrade(98));
		studentDao.insert(new Student().setId("201305075").setName("Bob").setGrade(83));
		System.out.println(studentDao.select(emptyStudent));

		Student orgStudent = studentDao.select(new Student().setId("201305075")).get(0);
		Student newStudent = new Student().setId("201305075").setName("new Bob").setGrade(67);

		HashMap<String, Student> params = new HashMap<String, Student>();
		params.put("student", newStudent);
		params.put("orgStudent", orgStudent);

		studentDao.update(params);
		System.out.println(studentDao.select(emptyStudent));
		
		studentDao.delete(newStudent);
		System.out.println(studentDao.select(emptyStudent));
	}
}
