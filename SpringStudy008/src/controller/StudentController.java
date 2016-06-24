/* Controller.java */
package controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.IStudentDao;
import service.StudentService;

@Controller
public class StudentController {
	public final static String STUDENT = "student";
	public final static String STUDENT_LIST = "studentList";
	public final static String STUDENT_ADD_FORM = "addStudentForm";
	public final static String STUDENT_ADD = "addStudent";
	public final static String STUDENT_MODIFY_FORM = "modifyStudentForm";
	public final static String STUDENT_MODIFY = "modifyStudent";
	public final static String STUDENT_DELETE = "deleteStudent";

	@Autowired
	private StudentService service;

	// 1. studentList.do : 학생 목록을 보여주는 페이지(studentListPage.jsp) 요청
	@RequestMapping("studentList.do")
	public String studentList(Model model) {
		model.addAttribute(this.STUDENT_LIST, service.getStudentList(null));
		return this.STUDENT_LIST;
	}

	// 2. addStudentForm.do : 학생 정보 추가 페이지(addStudentPage.jsp) 요청
	@RequestMapping("addStudentForm.do")
	public String addStudentForm() {
		return this.STUDENT_ADD_FORM;
	}

	// 3. addStudent.do : 학생 정보 추가 작업 처리 요청한 뒤, studentList.do로 리다이렉트
	@RequestMapping("addStudent.do")
	public String addStudent(String id, String name, String grade) {
		HashMap<String, Object> student = new HashMap<String, Object>();
		student.put(IStudentDao.STUDENT_ID, id);
		student.put(IStudentDao.STUDENT_NAME, name);
		student.put(IStudentDao.STUDENT_GRADE, grade);
		
		service.addStudent(student);

		return "redirect:" + this.STUDENT_LIST + ".do";
	}

	// 4. modifyStudentForm.do : 학생 정보 수정 페이지(modifyStudentPage.jsp) 요청
	@RequestMapping("modifyStudentForm.do")
	public String modifyStudentForm(Model model, String id) {
		HashMap<String, Object> student = new HashMap<String, Object>();
		student.put(IStudentDao.STUDENT_ID, id);
		model.addAttribute(this.STUDENT, service.getStudentList(student).get(0));
		
		return this.STUDENT_MODIFY_FORM;
	}

	// 5. modifyStudent.do : 학생 정보 수정 작업 처리 요청한 뒤, studentList.do로 리다이렉트
	@RequestMapping("modifyStudent.do")
	public String modifyStudent(String id, String name, String grade, String orgId) {
		HashMap<String, Object> student = new HashMap<String, Object>();
		student.put(IStudentDao.STUDENT_ID, id);
		student.put(IStudentDao.STUDENT_NAME, name);
		student.put(IStudentDao.STUDENT_GRADE, grade);
		student.put(IStudentDao.STUDENT_ORG_ID, orgId);
		
		service.modifyStudent(student);
		
		return "redirect:" + this.STUDENT_LIST + ".do";
	}

	// 6. deleteStudent.do : 학생 정보 삭제 작업 처리 요청한 뒤, studentList.do로 리다이렉트
	@RequestMapping("deleteStudent.do")
	public String deleteStudent(String id) {
		HashMap<String, Object> student = new HashMap<String, Object>();
		student.put(IStudentDao.STUDENT_ID, id);
		
		service.deleteStudent(student);
		
		return "redirect:" + this.STUDENT_LIST + ".do";
	}
}