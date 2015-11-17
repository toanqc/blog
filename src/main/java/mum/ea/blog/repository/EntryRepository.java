package mum.ea.blog.repository;

import java.util.List;

import mum.ea.blog.domain.Entry;

/**
 * 
 * @author qct
 *
 */
public interface EntryRepository extends BaseRepository<Entry> {

	public List<Entry> getAll();
}
