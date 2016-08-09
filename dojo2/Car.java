class Car {
  private String name;
  private String color;
  private int fuel = 100;
  private int distance = 0;
  // CONSTRUCTORS
  Car(String name, String color) {
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
  public int getFuel() {
    return this.fuel;
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
    System.out.println("ガソリン量: " + this.fuel + " (L)");
  }

  public void run(int distance) {
    if (distance > this.fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.distance += distance;
      this.fuel -= distance;
      System.out.println(distance + "km走りました");
    }
  }

  public void charge(int liter) {
    this.fuel += liter;
  }
}
