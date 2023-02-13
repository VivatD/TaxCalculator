public class Main {

    public static void main(String[] args) {


        double price = 60.0;
        double tax = 5.0;
        int quantity = 4;
        double total = 0;

        System.out.println("I want to buy " + quantity +" shirts!");

        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);
       
    }
}
