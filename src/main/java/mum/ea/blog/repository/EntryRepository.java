package mum.ea.blog.repository;

import java.util.List;

import mum.ea.blog.domain.Entry;

/**
 * 
 * @author Toan Quach
 *
 */
public interface EntryRepository extends BaseRepository<Entry> {

	/**
	 * 
	 * @return
	 */
	public List<Entry> getAll();

	/**
	 * 
	 * @param id
	 * @param title
	 * @param content
	 * @return
	 */
	public Entry patchEntry(long id, String title, String shortDescription, String content);

	/**
	 * 
	 * @param title
	 * @return
	 */
	public List<Entry> searchEntry(String title);
}
