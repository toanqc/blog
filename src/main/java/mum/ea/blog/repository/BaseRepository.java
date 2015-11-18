package mum.ea.blog.repository;

/**
 * 
 * @author Toan Quach
 *
 * @param <T>
 */
public interface BaseRepository<T> {

	T add(T t);

	T update(T t);

	boolean delete(long id);

	T get(long id);

}
