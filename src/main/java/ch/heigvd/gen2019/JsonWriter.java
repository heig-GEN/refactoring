package ch.heigvd.gen2019;

public class JsonWriter {

  private final ToJson element;

  public JsonWriter(ToJson element) {
    this.element = element;
  }

  public String getContents() {
    StringBuffer sb = new StringBuffer();
    element.encodeJson(sb);
    return sb.toString();
  }

}