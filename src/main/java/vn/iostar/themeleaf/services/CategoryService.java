package vn.iostar.themeleaf.services;

import java.util.List;
import java.util.Optional;

import vn.iostar.themeleaf.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


public interface CategoryService {

	void deleteById(Integer id);

	long count();

	List<CategoryEntity> findAll();

	<S extends CategoryEntity> S save(S entity);

	Optional<CategoryEntity> findById(Integer id);

	List<CategoryEntity> findByCategoryNameContaining(String name);
	//tim kiem va phan trang
	Page<CategoryEntity> findByCategoryNameContaining(String name, Pageable pageable);

	Page<CategoryEntity> findAll(Pageable pageable);

	List<CategoryEntity> findAll(Sort sort);

	List<CategoryEntity> findAllById(Iterable<Integer> id);
	void deleteAll();
}
