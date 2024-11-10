public class Bird extends Animal {
    private String furColour;

    public Bird(String Name, int Old, String furColour) {
        super(Name, Old);
        this.furColour = furColour;
    }

    @Override
    public void voice() {
        System.out.println(Name + " chirped.");
    }

    @Override
    public void Animalinfo() {
        System.out.println("Name: " + Name + ", Old: " + Old + " Years.");
        System.out.println("furColour: " + furColour);
    }
}