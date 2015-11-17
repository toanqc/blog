package mum.ea.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {

	@RequestMapping(value = { "/", "/home" })
	public String redirectRoot() {
		return "home";
	}

	@RequestMapping(value = "/about-me", method = RequestMethod.GET)
	public String addEntry() {
		return "about-me";
	}
}
