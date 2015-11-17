package mum.ea.blog.repository;

public interface BaseRepository<T> {

	T add(T t);

	T update(T t);

	boolean delete(long id);

	T get(long id);

}
