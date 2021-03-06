package ch.heigvd.gen2019;

public class Product implements ToJson {

  private String code;
  private Color color;
  private Size size;
  private double price;
  private String currency;

  public Product(String code, Color color, Size size, double price, String currency) {
    this.code = code;
    this.color = color;
    this.size = size;
    this.price = price;
    this.currency = currency;
  }

  public String getCode() {
    return code;
  }

  public Color getColor() {
    return color;
  }

  public Size getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public String getCurrency() {
    return currency;
  }

  public void encodeJson(StringBuffer sb) {
    sb.append("{");
    ToJson.appendFieldTo(sb, "code", getCode());
    ToJson.appendFieldTo(sb, "color", getColor().toString());

    if (getSize() != null) {
      ToJson.appendFieldTo(sb, "size", getSize().toString());
    }

    ToJson.appendFieldTo(sb, "price", getPrice());
    ToJson.appendFieldTo(sb, "currency", getCurrency());
    sb.delete(sb.length() - 2, sb.length());
    sb.append("}");
  }
}