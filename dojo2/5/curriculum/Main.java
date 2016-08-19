// TODO: Bicycleクラスを、Carクラス同様のフィールド、メソッドを持つように実装

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    bicycle.printData();
    bicycle.run(50);
    bicycle.printData();
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
    System.out.println("【自転車の情報】");
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + "(km)");
  }

  public void run(int distance) {
    System.out.println(distance + "km走ります");
    this.distance += distance;
  }
}
