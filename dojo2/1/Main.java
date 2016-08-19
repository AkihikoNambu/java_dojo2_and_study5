// TODO: Carクラスを作成、nameフィールドを追加、nameの値を出力

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ");
    System.out.println("【自転車の情報】");
    System.out.println("名前: " + bicycle.getName());
  }
}

class Bicycle {
  private String name;

  Bicycle(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
