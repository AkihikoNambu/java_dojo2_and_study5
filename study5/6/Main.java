// 学習内容: superを使って親のコンストラクタを呼び出す

class Main {
  public static void main(String[] args) {
    Car car = new Car("フェラーリ", "赤");
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    System.out.println("【車の情報】");
    car.printData();
    car.charge(50);
    car.printData();

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
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
}

class Vehicle {
  private String name;
  private String color;
  private int distance = 0;

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