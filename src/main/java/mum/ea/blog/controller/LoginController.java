package mum.ea.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Toan Quach
 *
 */

@Controller
public class LoginController {

	@RequestMapping(value = "/login/failed", method = RequestMethod.GET)
	public String loginFailed(ModelMap model) {
		model.addAttribute("error", true);
		return "login";
	}
}
