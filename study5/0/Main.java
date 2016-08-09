class Main {
  public static void main(String[] args) {
    Car car = new Car("車", "黒");
    Bicycle bicycle = new Bicycle("自転車", "赤");

    System.out.println("【車の情報】");
    car.printData();

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}

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
    if (distance > fuel) {
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
