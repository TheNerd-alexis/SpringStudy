/* SpringContainerTest.java */
package SpringStudy001;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringStudy001.bean.*;

public class SpringContainerTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringStudy001/applicationContext.xml");
		Student1 myStudent1 = (Student1) context.getBean("myStudent1");
		Student2 myStudent2 = context.getBean("myStudent2", Student2.class);
		StudentList studentList1 = context.getBean("myStudentList1", StudentList.class);
		StudentList studentList2 = context.getBean("myStudentList2", StudentList.class);
		
		System.out.println(myStudent1.toString());
		System.out.println(myStudent2.toString());
		System.out.println(studentList1.toString());
		System.out.println(studentList2.toString());
	}
}