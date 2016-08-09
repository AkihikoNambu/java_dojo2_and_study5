// 学習内容: charge, runメソッドを追加、protectedに書き換え

class Main {
  public static void main(String[] args) {
    Car car = new Car("車", "黒");
    Bicycle bicycle = new Bicycle("自転車", "白");

    System.out.println("【車の情報】");
    car.printData();

    System.out.println("<移動します>");
    car.run(100);
    car.printData();

    System.out.println("<給油します>");
    car.charge(50);
    car.printData();

    System.out.println("-----------------");

    System.out.println("【自転車の情報】");
    bicycle.printData();

    System.out.println("<移動します>");
    bicycle.run(20);
    bicycle.printData();
  }
}

class Car extends Vehicle {
  private int fuel = 100;

  Car(String name, String color) {
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    super.printData();
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

class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    this.distance += distance;
    System.out.println(distance + "km走りました");
  }
}

class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + " (km)");
  }
}