package com.bestsales.sales.persistence;

import java.util.List;

import com.bestsales.sales.domain.Category;

public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
