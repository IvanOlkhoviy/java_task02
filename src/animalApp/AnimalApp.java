package animalApp;

public class AnimalApp {


    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();

    }
}
