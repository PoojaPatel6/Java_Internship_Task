package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Varanasi");
		addr.setPincode(221307);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
	Student std = new Student();
		
		std.setRollno(101);
		std.setName("Pooja");
		std.setAddress(createAddrObj());
		return std;
	}
		
	}



// constructor Method Dependency Injection
//
//@Configuration
//public class SpringConfigFile {
//	@Bean
//	public Address createAddrObj() {
//		
//		Address addr = new Address(12,"Delhi",676654);
//		return addr;
//	}
//	
//	
//	@Bean
//	public Student createStdObj() {
//		
//	Student std = new Student(2, "riya", createAddrObj());
//	return std;
//	}
//}
//		