// Absztrakt osztály - Animal
public abstract class Animal {
    // Protected láthatóság: örökölt osztályok és ugyanazon csomag számára elérhető
    protected String name;

    // Konstruktor
    public Animal(String name) {
        this.name = name;
    }

    // Absztrakt metódus - a származtatott osztályoknak kell megvalósítaniuk
    public abstract void makeSound();

    // Egy konkrét metódus, amelyet minden állat örököl
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
