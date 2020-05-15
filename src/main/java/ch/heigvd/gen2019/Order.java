package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements ToJson {

  private List<Product> products = new ArrayList<Product>();
  private int id;

  public Order(int id) {
    this.id = id;
  }

  public int getOrderId() {
    return id;
  }

  public int getProductsCount() {
    return products.size();
  }

  public Product getProduct(int j) {
    return products.get(j);
  }

  public void AddProduct(Product product) {
    products.add(product);
  }

  public void encodeJson(StringBuffer sb) {
    sb.append("{");
    sb.append("\"id\": ");
    sb.append(getOrderId());
    sb.append(", ");
    sb.append("\"products\": ");

    Iterator<Product> iterator = products.iterator();
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
