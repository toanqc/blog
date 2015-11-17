package mum.ea.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.ea.blog.service.EntryService;

@Controller
public class EntryController {

	@Autowired
	private EntryService entryService;

	@RequestMapping(value = "/archives", method = RequestMethod.GET)
	public String getArchives(Model model) {
		return "archive";
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.GET)
	public String getEntry(@PathVariable long id, Model model) {
		model.addAttribute("entry", entryService.getEntry(id));
		return "detail";
	}
}
