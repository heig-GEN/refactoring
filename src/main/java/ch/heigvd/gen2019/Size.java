package ch.heigvd.gen2019;

public enum Size {
  XS("XS"), S("S"), M("M"), L("L"), XL("XL") , XXL("XXL");

  private final String name;

  /* private */ Size(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
