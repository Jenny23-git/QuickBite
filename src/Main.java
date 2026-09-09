import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // QuickBite Munchee Bus
        /*
        itemName: data type for this Array iss String
        itemPrices: data type for this Array is double
        itemAvailable: date type for this Array is boolean
         */
        // Initialize your Scanner object
        Scanner in = new Scanner(System.in);
        String[] itemName = {"Munchee Biscuits", "Bananas", "Diary Chocolate"};
        double[] itemPrice = {15.00, 100.00, 250.00};
        boolean[] itemAvailable = {true, false, true};

        // add items to the array using scanner class/object
        do{
            System.out.println("Are you adding item?: Y or N "); // hint the user
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n")) break;
            System.out.println("Enter item name: ");
            String name = in.next();

            System.out.println("Enter item price: ");
            double price = in.nextDouble();

            System.out.println("Enter item status: ");
            boolean status = in.nextBoolean(); // true / false

            System.out.println("Name \t Price \t status");
            System.out.println(name+ "\t" +price+ "\t" + status );

            // add new captured item to the store
            itemName = Arrays.copyOf(itemName, itemName.length+1);

            //  {"Munchee Biscuits", "Bananas", "Diary Chocolate", ""}
            itemName[itemName.length-1] = name;
            System.out.println(Arrays.toString(itemName));

            itemPrice = Arrays.copyOf(itemPrice, itemName.length+1);
            itemPrice[itemPrice.length-1] = price;
            System.out.println(Arrays.toString(itemPrice));

            itemAvailable = Arrays.copyOf(itemAvailable, itemAvailable.length+1);
            itemAvailable[itemAvailable.length-1] = status;
            System.out.println(Arrays.toString(itemAvailable));

        } while  (true);

        // print the item one-by-one
        for (int i = 0; i < itemName.length; i++) {
            // check the availability of an item and print
            // sold out or available


            String check =null;

            if (itemAvailable[i] == true) {
                check = "Available";

            }else {
                check = "Sold out";
            }
            System.out.println(itemName[i] + " " + itemPrice[i] + " " + check);



        }
    }
}