package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.StudentC;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("in/sp/config/applicationContext.xml");
		StudentC s1 = (StudentC) cxt.getBean("patna1");
		s1.show();
		
		
		StudentC s2 = (StudentC) cxt.getBean("ddn");
		s2.show();
		StudentC s3 = (StudentC) cxt.getBean("BLR");
		s2.show();
	}

}
