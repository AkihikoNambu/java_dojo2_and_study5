// 学習内容: Personクラスにインスタンスメソッドbuyを追加、ただしオーバーロード

class Main {
  public static void main(String[] args) {
    Car car = new Car("車", "黒");
    Bicycle bicycle = new Bicycle("自転車", "白");
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person1.buy(car);
    person2.buy(bicycle);

    System.out.println("【車の情報】");
    car.printData();
    System.out.println("【車の所有者の情報】");
    car.getOwner().printData();

    System.out.println("-----------------");

    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("【自転車の所有者の情報】");
    bicycle.getOwner().printData();
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
    if (distance > fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.distance += distance;
      this.fuel -= distance;
      System.out.println(distance + "km走りました");
    }
  }

  public void charge(int liter) {
    this.fuel += liter;
  }
}

class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    this.distance += distance;
    System.out.println(distance + "km走りました");
  }
}

abstract class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;
  private Person owner;

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
  public Person getOwner() {
    return this.owner;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("色: " + this.color);
    System.out.println("走行距離: " + this.distance + " (km)");
  }

  abstract public void run(int distance);
}

class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String getFirstName() { return this.firstName; }
  public String getMiddleName() { return this.middleName; }
  public String getLastName() { return this.lastName; }
  public int getAge() { return this.age; }
  public double getHeight() { return this.height; }
  public double getWeight() { return this.weight; }

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setMiddleName(String middleName) { this.middleName = middleName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public void setAge(int age) { this.age = age; }
  public void setHeight(double height) { this.height = height; }
  public void setWeight(double weight) { this.weight = weight; }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("身長は" + this.height + "mです");
    System.out.println("体重は" + this.weight + "kgです");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void buy(Car car) {
    car.setOwner(this);
  }

  public void buy(Bicycle bicycle) {
    bicycle.setOwner(this);
  }
}
