package somePackage;

public class Zoo {
  // This is entry point of Java program
  public static void main(String args[]) {
    // Dog and duck (created by Animal class)
    Animal dog = new Animal("dog", "woof woof", 4);
    Animal duck = new Animal("duck", "ga ga", 2);

    dog.speak();
    dog.eat();

    System.out.println("---");

    duck.speak();
    duck.eat();

    System.out.println("---");

    // Fish (created by Fish class which extends Animal class)
    Fish fish = new Fish("fish", "bloob bloob", 0);

    fish.speak(); // Method from Animal class
    fish.eat(); // Method from Animal class
    fish.swim(); // Method from Fish class
  }
}
