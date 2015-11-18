package mum.ea.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.ea.blog.domain.Contact;
import mum.ea.blog.service.EntryService;

@Controller
public class RootController {

	@Autowired
	private EntryService entryService;

	@RequestMapping(value = { "/", "/home", "/entries" }, method = RequestMethod.GET)
	public String redirectRoot(Model model) {
		model.addAttribute("entries", entryService.getAllEntries());
		return "home";
	}

	@RequestMapping(value = "/about-me", method = RequestMethod.GET)
	public String getAboutMePage() {
		return "about-me";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContactPage(@ModelAttribute Contact contact) {
		return "contact";
	}
}
