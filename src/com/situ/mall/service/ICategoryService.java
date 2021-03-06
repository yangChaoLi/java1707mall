package com.situ.mall.service;

import java.util.List;

import com.situ.mall.pojo.Category;

public interface ICategoryService {

	List<Category> findParentCategory();

	List<Category> findAll();

	List<Category> findCategory(int categoryId);


	boolean addParentCategory(Category category);

	boolean addSunCategory(Category category);

	boolean deleteCategory(Integer id);

}
