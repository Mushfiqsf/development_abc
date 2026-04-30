import java.util.Scanner;

public class Assingment1_ShopApp {
    public static void main(String[] args) {
        
        System.out.println("--- Welcome to the Mushfiq Shop--");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String Product_Name = sc.nextLine();

        System.out.print("Enter unit Price: ");
        double Unit_Price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int Quantity = sc.nextInt();
        
        double Subtotal = Unit_Price * Quantity;
        double Discount = Subtotal * (.12);
        double total = Subtotal - Discount;
        int final_ = (int) Math.floor(total);

        System.out.println("--- Final Receipt---");
        System.out.println("Item : " + Product_Name);
        System.out.println("Subtotal : $" + Subtotal);
        System.out.println("Discount Applied :  $" + Discount);
        System.out.println("Total (Rounded Down) :  $" + final_);
        System.out.println("-------------------------------");
    }
}
