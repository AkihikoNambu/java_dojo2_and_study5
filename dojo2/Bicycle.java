class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  // CONSTRUCTORS
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  }
  // GETTERS
  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  // SETTERS
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  // OTHER METHODS
  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + " (km)");
  }

  public void run(int distance) {
    this.distance += distance;
    System.out.println(distance + "km走りました");
  }
}
