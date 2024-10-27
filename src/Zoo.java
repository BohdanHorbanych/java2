import java.util.List;

public class Zoo {

    // Feeds birds in the list
    public static void feed(List<? extends Bird> list) {
        System.out.println("Feeding birds");
        for (Bird bird : list) {
            bird.eat();
        }
    }

    // Adds a FlyingBird to a specific section of the zoo
    public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
        System.out.println("Accepting a bird to a section");
        bird.checkWings();
        list.add(bird);
        System.out.println(bird);
    }

    // Registers a bird to the general birds list
    public static void registerBird(List<? super Bird> list, Bird newBird) {
        System.out.println("Adding a bird to the birds list");
        list.add(newBird);
        for (Object bird : list) {
            System.out.println(bird);
        }
    }
}
