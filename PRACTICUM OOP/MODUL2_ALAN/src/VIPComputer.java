class VIPCOmputer extends Computer {
    // To do: Create 1 variable according to the requirements
    protected boolean vipCard;

    // To do: Create a constructor for the VIPComputer class
    public VIPCOmputer (int numberOfComputers, String internetCafeName, float pricePerHour, boolean vipCard){
        super(numberOfComputers, internetCafeName, pricePerHour);
        this.vipCard = vipCard;
    }
    // To do: Create an Information method using Polymorphism Override with content that matches the requirements 
    // (can be different but must still align with the module material!)
    public void Information(){
        if (vipCard) {
            super.Information();
            System.out.println("Status :" + (vipCard? "Member VIP" : "Non VIP" ));
            System.out.println("\nBenefit Member VIP");
            System.out.println("- Discount 10% for playing up to 3 hours");
            System.out.println("Free Drink for 4 hours playing");
            System.out.println("- Priority booking gaming computer");  
        }else{
        System.out.println("\n Benefit Member VIP");
        System.out.println("dont expect");}
    }
    
    // To do: Create a Login method according to the requirements
    public void Login(String Username){
        System.out.println("Login with username : " + Username);  
    }
    // To do: Create a Playing method according to the requirements
    public void Playing (int hours){
        System.out.println("Playing for : " + hours + " hours");
    }
    // To do: Create a Playing method using Polymorphism Overloading according to the requirements
    public void Playing (int hours, int plusminutes){
        System.out.println("Playing for : " + hours + " hours" + plusminutes + "minutes");
    }
}