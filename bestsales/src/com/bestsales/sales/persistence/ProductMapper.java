package com.bestsales.sales.persistence;

import java.util.List;

import com.bestsales.sales.domain.Product;

public interface ProductMapper {

  List<Product> getProductListByCategory(String categoryId);

  Product getProduct(String productId);

  List<Product> searchProductList(String keywords);

}
