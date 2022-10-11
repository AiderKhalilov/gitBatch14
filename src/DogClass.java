public class DogClass {
    String breed, name, color;

    void bark() {
        System.out.println(breed + " can bark");
    }

    void run() {
        System.out.println(breed + " can run");
    }

    void play() {
        System.out.println(breed + " can play");
    }

    public static void main(String[] args) {
        DogClass dogBehaviour = new DogClass();
        dogBehaviour.breed = "Husky";
        dogBehaviour.name = "Puppy";
        dogBehaviour.color = "White";
        dogBehaviour.bark();
        dogBehaviour.run();
        dogBehaviour.play();

        dogBehaviour.breed = "Bulldog";
        dogBehaviour.name = "Monster";
        dogBehaviour.color = "Black";
        dogBehaviour.bark();
        dogBehaviour.run();
        dogBehaviour.play();

        dogBehaviour.breed = "Labrador";
        dogBehaviour.name = "Tobby";
        dogBehaviour.color = "Gray";
        dogBehaviour.bark();
        dogBehaviour.run();
        dogBehaviour.play();
    }
}
