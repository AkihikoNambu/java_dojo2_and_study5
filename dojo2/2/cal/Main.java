// TODO: Carクラスにcolorフィールドを追加、nameとcolorの値を出力

class Main {
  public static void main(String[] args) {
    Car car = new Car("ブリウス");
    System.out.println("【車の情報】");
    System.out.println("名前: " + car.getName());
  }
}

class Car {
  private String name;

  Car(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
