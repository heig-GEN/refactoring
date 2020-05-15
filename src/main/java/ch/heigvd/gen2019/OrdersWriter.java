package ch.heigvd.gen2019;

public class OrdersWriter {

  private Orders orders;

  public OrdersWriter(Orders orders) {
    this.orders = orders;
  }

  public String getContents() {
    StringBuffer sb = new StringBuffer("{\"orders\": [");

    for (int i = 0; i < orders.getOrdersCount(); i++) {
      Order order = orders.getOrder(i);
      sb.append("{");
      sb.append("\"id\": ");
      sb.append(order.getOrderId());
      sb.append(", ");
      sb.append("\"products\": [");
      for (int j = 0; j < order.getProductsCount(); j++) {
        order.getProduct(j).encodeJson(sb);
        sb.append(", ");
      }

      appendEndArray(sb, order.getProductsCount());
      sb.append(", ");
    }

    appendEndArray(sb, orders.getOrdersCount());
    return sb.toString();
  }

  private void appendEndArray(StringBuffer sb, int nbElements) {
    if (nbElements > 0) {
      sb.delete(sb.length() - 2, sb.length());
    }

    sb.append("]}");
  }

}