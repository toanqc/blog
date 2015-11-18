package mum.ea.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.service.EntryService;

/**
 * 
 * @author Toan Quach
 *
 */

@Controller
public class EntryController {

	@Autowired
	private EntryService entryService;

	@RequestMapping(value = "/archives", method = RequestMethod.GET)
	public String getArchivePage(@ModelAttribute Entry entry, Model model) {
		model.addAttribute("entries", entryService.getAllEntries());
		return "archive";
	}

	@RequestMapping(value = "/archives/search", method = RequestMethod.GET)
	public String getArchives(@ModelAttribute Entry entry, @RequestParam String title, Model model) {
		model.addAttribute("entries", entryService.searchEntry(title));
		return "archive";
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.GET)
	public String getEntry(@PathVariable long id, Model model) {
		model.addAttribute("entry", entryService.getEntry(id));
		return "detail";
	}
}
