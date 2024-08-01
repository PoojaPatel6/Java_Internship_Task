package in.sp.pooja;

import java.nio.ReadOnlyBufferException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.google.protobuf.Descriptors.OneofDescriptor;
import com.mysql.cj.Query;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate  =  context.getBean(JdbcTemplate.class);
 
        
        //----------------------Insert Operation ---------------------//
        
//        int std_rollno = 2;
//    	String std_name = "Sweta";
//    	float std_marks = 78.98f;
//    	
//        
//      String query = "Insert into student Values(?,?,?)";
//     int count =   jdbcTemplate.update(query, std_rollno, std_name, std_marks);
//      if(count > 0) {
//    	  
//    	  System.out.println("successfully Inserted");
//      }
//      else {
//    	  
//    	  System.out.println("Insertion Failed");
//     }
      
      
      //----------------------Update Operation ---------------------//
        
//        float marks = 99.0f;
//        int rollno = 2;
//        
//        String query = "UPDATE student SET std_marks=? WHERE std_roll=?"; 
//        int count =   jdbcTemplate.update(query,  marks, rollno);
//       if(count > 0) {
//   	  
//	      System.out.println("updation success");
//       }
//          else {
//   	  
//   	    System.out.println("Updation Failed");
//    }
       
        
        
  //----------------------Delete Operation ---------------------//
      
//        int rollno = 2;
//        
//        String query = "DELETE FROM student WHERE std_roll=?"; 
//        int count =   jdbcTemplate.update(query,  rollno);
//        if(count > 0) {
//   	  
//	      System.out.println("Deletion success");
//       }
//          else {
//   	  
//   	    System.out.println("Deletion Failed");
//    }
      
      
      
      
    //----------------------Select  Operation ---------------------//
        
//        String query = "SELECT * FROM student";
//    List<Student> std_list =   jdbcTemplate.query(query, new StudentRowMapper());
//       
//    for(Student std :std_list) {
//    	
//    	System.out.println("Rollno : "+std.getRollno());
//    	System.out.println("Name : "+std.getName());
//    	System.out.println("Marks : "+std.getMarks());
//    	
//    	System.out.println("-----------------------------------------------------");
//    	
//     }
    
//    
//        //----------------------Select  Operation 2nd method  if get only one data---------------------//  
//        
//        int rollno =1;
//        String query = "SELECT * FROM student where std_roll=?";
//        List<Student> std_list =   jdbcTemplate.query(query, new StudentRowMapper(),rollno);
//           
//        for(Student std :std_list) {
//        	
//        	System.out.println("Rollno : "+std.getRollno());
//        	System.out.println("Name : "+std.getName());
//        	System.out.println("Marks : "+std.getMarks());
//        	
//        	System.out.println("-----------------------------------------------------");
//        	
//         }
        
        
        
        
        
        
        //----------------------Select  Operation 3rd method ---------------------//  
//        queryforobject return only one value from student
        
        int rollno =2;
        String query = "SELECT * FROM student where std_roll=?";
        Student std =   jdbcTemplate.queryForObject(query, new StudentRowMapper(),rollno);
           

        	
        	System.out.println("Rollno : "+std.getRollno());
        	System.out.println("Name : "+std.getName());
        	System.out.println("Marks : "+std.getMarks());
        	
        	System.out.println("-----------------------------------------------------");
        	
         
    
    }
}
