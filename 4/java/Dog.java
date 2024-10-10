// Gyerek osztály - Dog
public class Dog extends Animal {
    protected Integer id;
    // Konstruktor, amely meghívja a szülő osztály konstruktorát
    public Dog(String name) {
        super(name);
    }

    // Az absztrakt metódus implementálása
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
