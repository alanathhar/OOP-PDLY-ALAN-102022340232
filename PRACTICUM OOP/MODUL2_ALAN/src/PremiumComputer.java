class PremiumComputer extends Computer {
    // To do: Create 1 variable according to the requirements
    protected boolean privatSpace;
    // To do: Create a constructor for the PremiumComputer class
    public PremiumComputer(int numberOfComputers, String internetCafeName, float pricePerHour, boolean privatSpace) {
        super(numberOfComputers, internetCafeName, pricePerHour);
        this.privatSpace = privatSpace;
    }
    // To do: Create an Information method using Polymorphism Override with content that matches the requirements 
    // (can be different but must still align with the module material!)
    public void Information(){
        super.Information();
        System.out.println("Status : " + (privatSpace ? "Premium Space" : "Regular Space" ));
        if (privatSpace == true){
        System.out.println("\nPremium Room Facility");
        System.out.println("- Private AC room");
        System.out.println("- Exclusive Chair Gaming");
        System.out.println("- High Tech Computer");
        System.out.println("- Internet Connection 100 mbps");
        }
        else{
        System.out.println("\nStandar Facility Room");
        System.out.println("- Basic Room");
        System.out.println("- Basic Chair");
        System.out.println("- Basic Tech Computer");
        System.out.println("- Internet Connection 1 mbps");
        }
        
    }
    // To do: Create an Order method according to the requirements
    public void Pesan (int ComputerNumber){
    System.out.println("Booking Computer No : " + ComputerNumber);
    }
    // To do: Create an AddService method according to the requirements
    public void AddService (String NameofFood){
        System.out.println("Add Food Service : " + NameofFood);
    }
    // To do: Create an AddService method using Polymorphism Overloading according to the requirements
    
    public void TambahLayanan (String NameofFood, String NameofDrink){
        System.out.println("Add food Service : " + NameofFood + "and Drink " + NameofDrink);
    }
}
