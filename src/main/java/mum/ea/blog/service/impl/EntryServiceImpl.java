package mum.ea.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.domain.Entry;
import mum.ea.blog.repository.EntryRepository;
import mum.ea.blog.service.EntryService;

@Transactional
@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry addEntry(Entry entry) {
		return entryRepository.add(entry);
	}
}
