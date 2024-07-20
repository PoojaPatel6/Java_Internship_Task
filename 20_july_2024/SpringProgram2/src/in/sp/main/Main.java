package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        // First method
//        Student std = (Student) context.getBean("stdId2");
//        std.display();

        // Second method
//        Student std = context.getBean(Student.class);
//        std.display();

        // Third method
//        Student std = (Student) context.getBean("stdObj");
//        std.display();
       // ----------------------------------
        
        
        Student std1 = (Student)context.getBean("stdObj1");
        std1.display();
        System.out.println("-------------------------------");
        
        Student std2 = (Student)context.getBean("stdObj2");
        std2.display();
    }
}
