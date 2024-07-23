package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;

@Configuration
public class ConfigFile {

    @Bean
    public Employee emp1() {


         Employee employee = new Employee();
    	
        Employee e = new Employee();
        e.setName("Karisma");
        e.setMail("k@gmail.com");
        e.setPhone("897676");
        e.setSkill("Mean, Python");
      
    
        return e;
    }
}
