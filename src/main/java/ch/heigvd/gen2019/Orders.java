package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.Iterator;
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
    sb.append("{\"orders\": ");


    Iterator<Order> iterator = orders.iterator();
    sb.append("[");
    while (iterator.hasNext()) {
      iterator.next().encodeJson(sb);
      if (iterator.hasNext()) {
        sb.append(", ");
      }
    }
    sb.append("]");

    sb.append("}");
  }
}
