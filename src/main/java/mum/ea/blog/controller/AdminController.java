package mum.ea.blog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.service.EntryService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EntryService entryService;

	@RequestMapping(value = "/entries/create", method = RequestMethod.GET)
	public String getEntryPage() {
		return "entry";
	}

	@RequestMapping(value = "/entries", method = RequestMethod.GET)
	public String getAllEntries(Model model) {
		model.addAttribute("entries", entryService.getAllEntries());
		return "entry-list";
	}

	@RequestMapping(value = "/entries", method = RequestMethod.POST)
	public String addEntry(@Valid @ModelAttribute Entry entry, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "entry";
		}

		entryService.addEntry(entry);
		return "redirect:/entries";
	}
}
