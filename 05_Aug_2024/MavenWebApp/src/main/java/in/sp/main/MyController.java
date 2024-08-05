package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @GetMapping("/welcomePage")
    public ModelAndView openWelcomePage() {
//        System.out.println("openWelcomePage() method executed");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("welcome");
        
//        ModelAndView mav = new ModelAndView("welcome");
//        mav.addObject("message", "Welcome to Spring MVC!");   
        
        return mav;
    }
    
    

    @GetMapping("/aboutUs")
    public String openAboutUsPage() {
    	
    	return "about-us";
    }
    
    @GetMapping("/myForm")
    public String openMyFormPage() {
    	
    	return "my-form";
    }
//    
//    @PostMapping("/submitForm")
//    public String handleMyForm(HttpServletRequest req) {
//    	String myname =req.getParameter("name1");
//    	String myemail =req.getParameter("email11");
//    	String myphno =req.getParameter("phoneno1");
//    	
//    	System.out.println("Name: "+ "myname");
//    	System.out.println("Email Id: "+ "myemail");
//    	System.out.println("Phone No: "+ "myphno");
//    	
//    	return "profile";
//   }
    
//    @PostMapping("/submitForm")
//    public String handleMyForm(
//    		@RequestParam("name")String myname ,
//            @RequestParam("email")String myemail,
//            @RequestParam("phoneno")String myphno,
//            Model model)
// {
//    	
//    	System.out.println("Name: "+ myname);
//    	System.out.println("Email Id: "+ myemail);
//   	    System.out.println("Phone No: "+ myphno);
//    	
//   	    
//   	    model.addAttribute("model_name", myname);
//   	    model.addAttribute("model_email", myemail);
//   	    model.addAttribute("model_phno", myphno);
//   	 
//    	return "profile";
//    }
    
    
//    @PostMapping("/submitForm")
//  public String handleMyForm(
//  		@RequestParam("name")String myname ,
//          @RequestParam("email")String myemail,
//          @RequestParam("phoneno")String myphno,
//          Model model)
//{
//  	
//  	System.out.println("Name: "+ myname);
// 	System.out.println("Email Id: "+ myemail);
//	System.out.println("Phone No: "+ myphno);
//  	
//	
//	User user = new User();
//	user.setName(myname);
//	user.setEmail(myemail);
//	user.setPhoneno(myphno);
// 	    
// 	    model.addAttribute("model_user", user);
//	
//	    
//	   	return "profile";
//  }
    
    
    
    @PostMapping("/submitForm")
  public String handleMyForm(@ModelAttribute User user)   // directlty bind the data into the userObject 
{
  	
  	System.out.println("Name: "+ user.getName());
 	System.out.println("Email Id: "+ user.getEmail());
	System.out.println("Phone No: "+ user.getPhoneno());
  	
	

	
	    
	   	return "profile";
  }
    
}


