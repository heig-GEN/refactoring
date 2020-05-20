package ch.heigvd.gen2019;

import java.util.Collection;

public interface ToJson {

  void encodeJson(StringBuffer buffer);

  static <T extends ToJson> void encodeCollection(StringBuffer sb, Collection<T> elements) {
    var iterator = elements.iterator();
    sb.append("[");
    while (iterator.hasNext()) {
      iterator.next().encodeJson(sb);
      if (iterator.hasNext()) {
        sb.append(", ");
      }
    }
    sb.append("]");
  }

  static void appendFieldTo(StringBuffer sb, String fieldName, String fieldValue) {
    sb.append("\"");
    sb.append(fieldName);
    sb.append("\": ");

    sb.append("\"");
    sb.append(fieldValue);
    sb.append("\", ");
  }
}
