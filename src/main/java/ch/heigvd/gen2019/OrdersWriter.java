package ch.heigvd.gen2019;

public class OrdersWriter {

  private Orders orders;

  public OrdersWriter(Orders orders) {
    this.orders = orders;
  }

  public String getContents() {
    StringBuffer sb = new StringBuffer("{\"orders\": [");

    encodeOrders(sb, orders);
    return sb.toString();
  }

  private void encodeOrders(StringBuffer sb, Orders orders) {
    for (int i = 0; i < orders.getOrdersCount(); i++) {
      Order order = orders.getOrder(i);
      order.encodeJson(sb);
      sb.append(", ");
    }

    if (orders.getOrdersCount() > 0) {
      sb.delete(sb.length() - 2, sb.length());
    }

    sb.append("]}");
  }

}