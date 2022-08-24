public class HealthyBurger extends Hamburger {

    //Variables to store healthy burger additions
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //Declare name and bread roll
    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat , price, "Low Carb bun");

    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){
            System.out.println(healthyExtra1Name + " has been added for a cost of " + healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            System.out.println(healthyExtra2Name + " has been added for a cost of " + healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
