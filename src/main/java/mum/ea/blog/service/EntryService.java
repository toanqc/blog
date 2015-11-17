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

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Entry getEntry(long id);

	/**
	 * 
	 * @param entry
	 * @return
	 */
	public Entry updateEntry(Entry entry);

	/**
	 * 
	 * @param id
	 * @param title
	 * @param content
	 * @return
	 */
	public Entry patchEntry(long id, String title, String content);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteEntry(long id);

	/**
	 * 
	 * @param title
	 * @return
	 */
	public List<Entry> searchEntry(String title);
}
