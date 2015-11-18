package mum.ea.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public @ResponseBody List<Entry> getArchives(@ModelAttribute Entry entry, @RequestParam String title, Model model) {
		return convertToSimpleEntries(entryService.searchEntry(title));
	}

	@RequestMapping(value = "/entries/{id}", method = RequestMethod.GET)
	public String getEntry(@PathVariable long id, Model model) {
		model.addAttribute("entry", entryService.getEntry(id));
		return "detail";
	}

	private List<Entry> convertToSimpleEntries(List<Entry> entries) {
		List<Entry> resultList = new ArrayList<>();
		for (Entry e : entries) {
			Entry entry = new Entry();
			entry.setId(e.getId());
			entry.setTitle(e.getTitle());
			entry.setCreatedDate(e.getCreatedDate());
			resultList.add(entry);
		}

		return resultList;
	}
}
