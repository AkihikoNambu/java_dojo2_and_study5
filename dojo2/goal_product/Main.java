class Main {
  public static void main(String[] args) {
    // GENERATE INSTANCES
    Car car = new Car("車", "黒");
    Bicycle bicycle = new Bicycle("自転車", "赤");

    car.printData();
    car.charge(40);
    car.printData();
    car.charge(-40);
    car.printData();

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}