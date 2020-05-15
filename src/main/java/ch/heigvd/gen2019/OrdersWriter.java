package ch.heigvd.gen2019;

public class OrdersWriter {

  private Orders orders;

  public OrdersWriter(Orders orders) {
    this.orders = orders;
  }

  public String getContents() {
    StringBuffer sb = new StringBuffer("{\"orders\": [");

    orders.encodeOrders(sb);
    return sb.toString();
  }

}