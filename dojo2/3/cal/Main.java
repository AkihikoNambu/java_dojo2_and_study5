// TODO: distanceフィールドを追加、distanceフィールドの初期値をセット、distanceの値を出力

class Main {
  public static void main(String[] args) {
    Car car = new Car("ブリウス", "黒");
    car.printData();
  }
}

class Car {
  private String name;
  private String color;

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("【車の情報】");
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
  }
}
