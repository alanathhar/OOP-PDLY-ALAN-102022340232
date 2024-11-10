public class Cat extends Animal {
    private String breed;

    public Cat(String Name, int Old, String breed) {
        super(Name, Old);
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println(Name + " meow.");
    }

    @Override
    public void Animalinfo() {
        System.out.println("Name: " + Name + ", Old: " + Old + " Years.");
        System.out.println("Breed: " + breed);
    }
}