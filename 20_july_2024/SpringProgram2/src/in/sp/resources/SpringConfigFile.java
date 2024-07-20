package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

    // First method
//    @Bean
//    public Student stdId2() {
//        Student std = new Student();
//        std.setName("Divya");
//        std.setRollno(10);
//        std.setEmail("divi@gmail.com");
//        return std;
//    }

    // Second method
    @Bean("stdObj1")
    public Student createStdBeanObj1() {
        Student std = new Student();
        std.setName("Divya");
        std.setRollno(10);
        std.setEmail("divi@gmail.com");
        return std;
    }
    @Bean("stdObj2")
    public Student createStdBeanObj2() {
        Student std = new Student();
        std.setName("Divesh");
        std.setRollno(20);
        std.setEmail("divesh@gmail.com");
        return std;
    }
}
