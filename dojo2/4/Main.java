// TODO: Carクラスにrunメソッドを追加

class Main {
  public static void main(String[] args) {
    Car car = new Car("ブリウス", "黒");
    car.printData();
    car.run(50);
    car.printData();
  }
}

class Car {
  private String name;
  private String color;
  private int distance = 0;

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("【車の情報】");
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + "(km)");
  }

  public void run(int distance) {
    this.distance += distance;
    System.out.println(distance + "km走りました");
  }
}
