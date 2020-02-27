public class Animal {
  String name;
  String sound;
  int numberOfLegs;

  // This is a constructor, must have same name as class.
  public Animal(String name, String sound, int numberOfLegs) {
    this.name = name;
    this.sound = sound;
    this.numberOfLegs = numberOfLegs;
  }

  public void speak() {
    System.out.println("Hello, my name is " + name + ".");
    System.out.println("I sound like " + sound + ".");
    System.out.println("I have " + numberOfLegs + " legs.");
  }

  public void eat() {
    System.out.println("I am eating...");
  }

  public void walk() {
    System.out.println("I am walking...");
  }
}
