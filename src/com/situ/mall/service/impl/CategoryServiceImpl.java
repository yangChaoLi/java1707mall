package com.situ.mall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.mall.dao.CategoryDao;
import com.situ.mall.pojo.Category;
import com.situ.mall.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private CategoryDao categorMapper;

	public List<Category> findParentCategory() {
		return categorMapper.findAllParentCategory();
	}

	public List<Category> findAll() {
		return categorMapper.findAll();
	}

}