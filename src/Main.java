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