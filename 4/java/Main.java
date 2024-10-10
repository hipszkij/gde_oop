public class Main {
    public static void main(String[] args) {
        // Példányosítunk egy Dog és egy Cat objektumot
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Meghívjuk a makeSound metódusokat (polimorfizmus)
        dog.makeSound();  // Eredmény: "Buddy says: Woof Woof!"
        cat.makeSound();  // Eredmény: "Whiskers says: Meow Meow!"

        // Meghívjuk az örökölt sleep metódust
        dog.sleep();  // Eredmény: "Buddy is sleeping."
        cat.sleep();  // Eredmény: "Whiskers is sleeping."
    }
}
