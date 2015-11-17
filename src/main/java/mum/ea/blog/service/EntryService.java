package mum.ea.blog.service;

import java.util.List;

import mum.ea.blog.domain.Entry;

public interface EntryService {

	/**
	 * 
	 * @return
	 */
	public Entry addEntry(Entry entry);

	/**
	 * 
	 * @return
	 */
	public List<Entry> getAllEntries();
}
