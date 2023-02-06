package myPackage2;

public class Person {

  private int y; // 0
  public Integer x; // null
  public int age;
  private String name;

  public String getName() {
    return name;
  }

  public int getAge() {
    return calculateAge();
  }

  protected int calculateAge() {
    return 1; // calculeaza
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}

