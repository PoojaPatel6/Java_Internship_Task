package in.adit.p.maven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import in.adit.beans.Student;
import in.adit.context.ConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 //        System.out.println( "Connected" );
    	try {
    	ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
        JdbcTemplate jT= (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
        //   System.out.println("connected");
    
      // create database
   
//   String query = "create database adit1";
//   jT.update(query);
//   System.out.println("database created");
//    }catch(Exception e) {
//    	  System.out.println(e);
//    }
        
        
        
        // create table
        
//        String query = "create table student(name varchar(100 ), mail varchar(100), age varchar(50))";
//        jT.update(query);
//        System.out.println("table created");
//         }catch(Exception e) {
//         	  System.out.println(e);
//         }
        
        
        //1st method  for inserting value in table
        
//      String name = "Anshi";
//      String mail ="anshi@gmail.com";
//      String age = "30";
//      String query = "insert into student values(?,?,?)";
 //   String query ="delete from student where age >=?";
//   System.out.println("Deleted");
        
 //  jT.update(query, name,mail,age);
 //     System.out.println("Data Inserted");
        
        
        // 2nd method
//        
//        String query = "insert into student values(?,?,?)";
//        jT.update(query, "pooja", "pooja@gmail.com","25");
//        System.out.println("Data Inserted");
//        
//    }catch(Exception e) {
//      	  System.out.println(e);     
//      	  
//    }
        
        
        
        // delete data where age >=20
        
        
//    String name = "Anshi";
//    String mail = "twenty@gmail.com";
//    String age = "20";
//
//     String query ="delete from student where age >=?";
//     jT.update(query,age);
//     System.out.println("Deleted");
     
  
     
     //update method
             
 String name = "Anshi";
 String mail = "twenty@gmail.com";
 String age = "20";

  String query ="update student set mail=? where name =?";
  jT.update(query,"bulbul@gmail.com",name);
  System.out.println("Updated");
     
     
     
     
     
     
     
     
     
     
     
              }catch(Exception e) {
        	  System.out.println(e);     
       	  
     }
}
}