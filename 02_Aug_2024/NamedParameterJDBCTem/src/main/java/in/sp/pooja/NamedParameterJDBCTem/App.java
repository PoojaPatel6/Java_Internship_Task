package in.sp.pooja.NamedParameterJDBCTem;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext  context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	NamedParameterJdbcTemplate npJdbcTemplate =context.getBean(NamedParameterJdbcTemplate.class); 
    	 
    	Map<String, Object>map = new HashMap<String, Object>();
    	map.put("key_rollno", 6);
    	map.put("key_name", "Pooja");
    	map.put("key_marks", "94.34");
    	
    	String query = "insert into student values(:key_rollno, :key_name, :key_marks)";
    	int count = npJdbcTemplate.update(query,map);
    	
    	if (count > 0)
    	{
    		
    		System.out.println("data Inserted");
    	}else {
    		
    		System.out.println(" not Inserted");
    	}
    	
    }
}
