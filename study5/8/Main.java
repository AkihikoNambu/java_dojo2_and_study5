// 学習内容: runメソッドを抽象メソッド化、抽象クラス

class Main {
  public static void main(String[] args) {
    Car car = new Car("フェラーリ", "赤");
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    System.out.println("【車の情報】");
    car.printData();
    car.run(100);
    car.printData();
    car.charge(50);
    car.printData();

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
    bicycle.printData();
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
    System.out.println(distance + "km走ります");
    if (distance < this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println("ガソリンが足りません");
    }
  }

  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if (litre <= 0) {
      System.out.println("給油できません");
    } else if (litre + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
  }
}

class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    System.out.println(distance + "km走ります");
    this.distance += distance;
  }
}

abstract class Vehicle {
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

  abstract public void run(int distance);
}