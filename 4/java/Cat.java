// Gyerek osztály - Cat
public class Cat extends Animal {

    // Konstruktor, amely meghívja a szülő osztály konstruktorát
    public Cat(String name) {
        super(name);
    }

    // Az absztrakt metódus implementálása
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}