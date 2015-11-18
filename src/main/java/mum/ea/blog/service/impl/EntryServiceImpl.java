package mum.ea.blog.service.impl;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.repository.EntryRepository;
import mum.ea.blog.service.EntryService;
import mum.ea.blog.util.BlogUtil;

/**
 * 
 * @author Toan Quach
 *
 */

@Transactional
@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry addEntry(Entry entry) {
		// trim content down to 300 character then make it a short description
		String shortDescription = BlogUtil.trimContent(entry.getEntryDetail().getContent());
		// set short description
		entry.setShortDescription(shortDescription);
		// set current date for created date
		entry.setCreatedDate(Calendar.getInstance().getTime());
		// save entry
		return entryRepository.add(entry);
	}

	@Override
	public List<Entry> getAllEntries() {
		return entryRepository.getAll();
	}

	@Override
	public Entry getEntry(long id) {
		Entry entry = entryRepository.get(id);
		Hibernate.initialize(entry.getEntryDetail());

		return entry;
	}

	@Override
	public Entry updateEntry(Entry entry) {
		return entryRepository.update(entry);
	}

	@Override
	public boolean deleteEntry(long id) {
		return entryRepository.delete(id);
	}

	@Override
	public Entry patchEntry(long id, String title, String content) {
		// trim content down to 300 character then make it a short description
		String shortDescription = BlogUtil.trimContent(content);
		return entryRepository.patchEntry(id, title, shortDescription, content);
	}

	@Override
	public List<Entry> searchEntry(String title) {
		return entryRepository.searchEntry(title);
	}
}
