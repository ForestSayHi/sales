package com.bestsales.sales.persistence;

import java.util.List;

import com.bestsales.sales.domain.Order;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
