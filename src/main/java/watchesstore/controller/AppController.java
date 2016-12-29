package watchesstore.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AppController {
	@RequestMapping(value={"/","/home"})
	public String showHome(){
		return "index";
	}
	@RequestMapping("/contactus")
	public String showContactUs(){
		return "contactus";
	}
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping("/aboutus")
	public String showAboutUs(){
		return "aboutus";
	}
	
}

