package mum.ea.blog.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.repository.EntryRepository;

@Transactional
@Repository
@SuppressWarnings("unchecked")
public class EntryRepositoryImpl extends BaseRepositoryImpl<Entry> implements EntryRepository {

	public List<Entry> getAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Entry");
		return new ArrayList<Entry>(query.list());
	}

	@Override
	public Entry patchEntry(long id, String title, String shortDescription, String content) {
		Entry entry = this.load(id);

		entry.setTitle(title);
		entry.setShortDescription(shortDescription);
		entry.getEntryDetail().setContent(content);

		return this.update(entry);
	}

	@Override
	public List<Entry> searchEntry(String title) {
		Query query = sessionFactory.getCurrentSession().createQuery("from Entry e where e.title like :title");
		query.setString("title", "%" + title + "%");
		return new ArrayList<Entry>(query.list());
	}
}
