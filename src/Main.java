public class Main {


    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 15.56, "Sourdough");
        hamburger.addHamburgerAddition1("Tomato", .50);
        hamburger.addHamburgerAddition2("Lettuce", .25);
        hamburger.addHamburgerAddition3("Cheese", .25);
        System.out.println("the total price is $" + hamburger.itemizeHamburger() + "\n");


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("You purchased a Deluxe Burger for a price of $" + deluxeBurger.itemizeHamburger() + "\n");

        HealthyBurger healthyBurger = new HealthyBurger("Extra Lean Beef", 14.50);
        healthyBurger.addHealthyAddition1("Spinach", 0.75);
        healthyBurger.addHealthyAddition2("Cabbage", 0.75);
        System.out.println("Total cost for your healthy burger is $" + healthyBurger.itemizeHamburger());






    }



}
