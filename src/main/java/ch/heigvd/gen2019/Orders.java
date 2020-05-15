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

    ToJson.encodeCollection(sb, orders);

    sb.append("}");
  }
}
