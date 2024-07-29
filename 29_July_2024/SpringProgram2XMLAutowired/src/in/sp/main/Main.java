package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;


public class Main {
	public static void main(String[]args) {
		
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student std = (Student) cxt.getBean("stdId");
		std.display();
		
	}
	

}
