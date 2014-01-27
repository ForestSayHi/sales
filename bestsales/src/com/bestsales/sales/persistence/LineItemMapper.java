package com.bestsales.sales.persistence;

import java.util.List;

import com.bestsales.sales.domain.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
