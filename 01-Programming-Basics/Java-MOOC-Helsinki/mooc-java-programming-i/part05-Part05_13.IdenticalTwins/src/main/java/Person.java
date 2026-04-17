public class Person {

  private String name;
  private SimpleDate birthday;
  private int height;
  private int weight;

  public Person(String name, SimpleDate birthday, int height, int weight) {
    this.name = name;
    this.birthday = birthday;
    this.height = height;
    this.weight = weight;
  }

  // implement an equals method here for checking the equality of objects
  public boolean equals(Object target) {
    if (this == target) {
      return true;
    }

    if (!(target instanceof Person)) {
      return false;
    }

    Person targetPerson = (Person) target;
    return targetPerson.name == this.name
        && targetPerson.birthday.equals(this.birthday)
        && targetPerson.height == this.height
        && targetPerson.weight == this.weight;
  }
}
