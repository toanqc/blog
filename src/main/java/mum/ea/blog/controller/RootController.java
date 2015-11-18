package mum.ea.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.ea.blog.domain.Contact;
import mum.ea.blog.service.EntryService;
import mum.ea.blog.service.JMSService;

@Controller
public class RootController {

	@Autowired
	private EntryService entryService;

	@Autowired
	private JMSService jmsService;

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

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String sendMessage(@ModelAttribute Contact contact, RedirectAttributes redirectAttributes) {
		jmsService.send(contact);
		redirectAttributes.addFlashAttribute("isSuccess", true);
		return "redirect:/contact";
	}
}
