package ch.heigvd.gen2019;

public enum Color {
  BLUE("blue"),
  RED("red"),
  YELLOW("yellow");

  private final String name;

  /* private */ Color(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
