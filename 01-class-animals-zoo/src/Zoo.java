public class Zoo {
  // This is entry point of java program
  public static void main(String args[]) {
    Animal dog = new Animal("dog", "woof woof", 4);
    Animal duck = new Animal("duck","ga ga",2);

    dog.speak();
    duck.speak();
  }
}
