package mum.ea.blog.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.service.EntryService;
import mum.ea.blog.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EntryService entryService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/entries/create", method = RequestMethod.GET)
	public String getEntryPage(@ModelAttribute Entry entry, Model model) {
		model.addAttribute("isUpdate", false);
		return "entry";
	}

	@RequestMapping(value = "/entries", method = RequestMethod.GET)
	public String getAllEntries(Model model) {
		model.addAttribute("entries", entryService.getAllEntries());
		return "entry-list";
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.GET)
	public String getEntry(@PathVariable long id, Model model) {
		model.addAttribute("entry", entryService.getEntry(id));
		model.addAttribute("isUpdate", true);
		return "entry";
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.POST)
	public String patchEntry(@Valid @ModelAttribute Entry entry, BindingResult bindingResult, @PathVariable long id) {
		entryService.patchEntry(id, entry.getTitle(), entry.getEntryDetail().getContent());
		return "redirect:/admin/entries";
	}

	@RequestMapping(value = "/entries/{id}/delete", method = RequestMethod.GET)
	public String deleteEntry(@PathVariable long id) {
		entryService.deleteEntry(id);
		return "redirect:/admin/entries";
	}

	@RequestMapping(value = "/entries", method = RequestMethod.POST)
	public String addEntry(@Valid @ModelAttribute Entry entry, BindingResult bindingResult, Principal principal) {
		if (bindingResult.hasErrors()) {
			return "entry";
		}

		entry.setUser(userService.getByUsername(principal.getName()));
		entryService.addEntry(entry);
		return "redirect:/admin/entries";
	}
}
