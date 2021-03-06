package com.bestsales.sales.persistence;

import java.util.List;
import java.util.Map;

import com.bestsales.sales.domain.Item;

public interface ItemMapper {

  void updateInventoryQuantity(Map<String, Object> param);

  int getInventoryQuantity(String itemId);

  List<Item> getItemListByProduct(String productId);

  Item getItem(String itemId);

}
