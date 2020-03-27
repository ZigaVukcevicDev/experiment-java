package somePackage;

public class Fish extends Animal {
  public Fish(String name, String sound, int numberOfLegs) {
    super(name, sound, numberOfLegs);
  }

  public void swim() {
    System.out.println("I am swimming.");
  }
}
