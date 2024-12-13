class Computer {
    // To do: Create 3 variables according to the requirements
    protected int numberOfComputers;
    protected String internetCafeName;
    protected float pricePerHour;
    // To do: Create a constructor for the Computer class
    public Computer(int numberOfComputers, String internetCafeName, float pricePerHour){
        this.numberOfComputers = numberOfComputers;
        this.internetCafeName = internetCafeName;
        this.pricePerHour = pricePerHour;
    }
    // To do: Create an Information method with content that matches the requirements 
    public void Information(){
        System.out.println("numberOfComputers = " + numberOfComputers);
        System.out.println("internetCafeName = " + internetCafeName);
        System.out.println("pricePerHour + " + pricePerHour);
    }
    // (can be different but must still align with the module material!)

}