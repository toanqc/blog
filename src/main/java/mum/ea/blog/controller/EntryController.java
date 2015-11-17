package mum.ea.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntryController {

	@RequestMapping(value = "/archives", method = RequestMethod.GET)
	public String getArchives() {
		return "archive";
	}

	@RequestMapping(value = "/entries", method = RequestMethod.GET)
	public String getAllEntries() {
		return "home";
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.GET)
	public String getEntry(@PathVariable long id) {
		return "detail";
	}
	
	@RequestMapping(value = "/entries", method = RequestMethod.POST)
	public String addEntry() {
		return "detail";
	}
}
