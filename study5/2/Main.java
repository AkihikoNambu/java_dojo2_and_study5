// 学習内容: 子クラスに独自のフィールドとメソッドを追加する

class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setName("hoge");
    car.setColor("黒");
    Bicycle bicycle = new Bicycle();
    bicycle.setName("fuga");
    bicycle.setColor("白");

    System.out.println("【車の情報】");
    car.printData();
    System.out.println("ガソリン量: " + car.getFuel() + " (L)");

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}

class Car extends Vehicle {
  private int fuel = 100;

  public int getFuel() {
    return this.fuel;
  }
}

class Bicycle extends Vehicle {
}

class Vehicle {
  private String name;
  private String color;
  private int distance = 0;

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