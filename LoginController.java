package kr.co.sangsaeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDao LoginDao;
	
	@Autowired
	private CustomUserDetailsService service;
	
	@RequestMapping(value = "/Login", method = { RequestMethod.GET, RequestMethod.POST })
	public String SearchID() {

		return "Login";
	}

	@RequestMapping(value = "/selectID", method = RequestMethod.GET)
	public String selectID(Model model, String nick, String password) {
		
		LoginDao.Login(nick, password);
		
	return "home";
	}
	
	//@RequestMapping(value = "/selectID", method = RequestMethod.GET)
	//public String selectID(Model model, String nick, String password) {
	//	System.out.println("###################컨트롤러"+nick);
	//	service.loadUserByUsername(nick);
		
	//	return "home";
	//}
	
}
