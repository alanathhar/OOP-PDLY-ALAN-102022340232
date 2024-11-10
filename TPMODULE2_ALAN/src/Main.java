public class Main {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("Kira", 2, "Persia");
        Bird bird1 = new Bird("Eagle", 1, "Brown");

        // Output for Cat
        System.out.println("Animal Detail\n");
        System.out.println("this is a " + Cat1.Name + " !");
        Cat1.voice();
        Cat1.eating();
        Cat1.eating("fish");

        // Output for Bird
        System.out.println("\nthis is a " + bird1.Name + " !");
        bird1.voice();
        bird1.eating();
        bird1.eating("grains");

        // Detail information using Animal Info()
        System.out.println();
        Cat1.Animalinfo();
        bird1.Animalinfo();
    }
}