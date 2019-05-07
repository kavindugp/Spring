import java.util.*;

import lk.codelabs.sms.model.Student;
import lk.codelabs.sms.service.StudentService;
import lk.codelabs.sms.service.StudentServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		List<Student> students = service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
}
