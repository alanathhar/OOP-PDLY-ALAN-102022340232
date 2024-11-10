
class Animal {
    protected String Name;
    protected int Old;

    public Animal(String Name, int Old) {
        this.Name = Name;
        this.Old = Old;
    }

    public void voice() {
        System.out.println(Name + " sounding voice.");
    }

    public void eating() {
        System.out.println(Name + " while eating.");
    }

    public void eating(String food) {
        System.out.println(Name + " while eating " + food + ".");
    }

    public void Animalinfo() {
        System.out.println("Name: " + Name + ", Old: " + Old + " years.");
    }
}