package ch.heigvd.gen2019;

import java.util.ArrayList;
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
    ToJson.appendFieldTo(sb, "id", getOrderId());
    sb.append("\"products\": ");

    ToJson.encodeCollection(sb, products);

    sb.append("}");
  }
}
