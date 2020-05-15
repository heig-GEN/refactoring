package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Orders implements ToJson {

  private List<Order> orders = new ArrayList<Order>();

  public void AddOrder(Order order) {
    orders.add(order);
  }

  public int getOrdersCount() {
    return orders.size();
  }

  public Order getOrder(int i) {
    return orders.get(i);
  }

  public void encodeJson(StringBuffer sb) {
    sb.append("{\"orders\": [");
    for (int i = 0; i < getOrdersCount(); i++) {
      Order order = getOrder(i);
      order.encodeJson(sb);
      sb.append(", ");
    }

    if (getOrdersCount() > 0) {
      sb.delete(sb.length() - 2, sb.length());
    }

    sb.append("]}");
  }
}
