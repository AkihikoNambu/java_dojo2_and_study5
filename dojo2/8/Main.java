// TODO: Carクラスのchargeメソッドを追加

class Main {
  public static void main(String[] args) {
    Car car = new Car("ブリウス", "黒");
    car.printData();
    car.run(50);
    car.printData();
    car.charge(40);
    car.printData();
    car.charge(-10);

    Bicycle bicycle = new Bicycle("自転車", "赤");
    bicycle.printData();
    bicycle.run(10);
    bicycle.printData();
  }
}

class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("【車の情報】");
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("合計走行距離: " + this.distance + "(km)");
    System.out.println("残りのガソリン量: " + this.fuel + "(L)");
  }

  public void run(int distance) {
    if (this.fuel < distance) {
      System.out.println("ガソリンが足りません");
    } else {
      this.distance += distance;
      System.out.println(distance + "km走りました");
      this.fuel -= distance;
    }
  }

  public void charge(int litre) {
    if (litre < 0) {
      System.out.println("給油できません");
    } else {
      this.fuel += litre;
      System.out.println(litre + "L給油しました");
    }
  }
}

class Bicycle {
  private String name;
  private String color;
  private int distance = 0;

  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("【自転車の情報】");
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + "(km)");
  }

  public void run(int distance) {
    this.distance += distance;
    System.out.println(distance + "km走りました");
  }
}