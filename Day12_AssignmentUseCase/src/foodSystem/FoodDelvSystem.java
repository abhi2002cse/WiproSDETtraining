package foodSystem;
import java.io.*;
import java.util.*;

public class FoodDelvSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        try {
            
            File menuFile = new File("menu.txt");
            File orderFile = new File("order.txt");
            File deliveryFile = new File("delivery.txt");

            if (!menuFile.exists()) menuFile.createNewFile();
            if (!orderFile.exists()) orderFile.createNewFile();
            if (!deliveryFile.exists()) deliveryFile.createNewFile();
            
            int choice;
            
            do {
                System.out.println("\n===== FOOD DELIVERY MENU =====");
                System.out.println("1. Add Menu Item");
                System.out.println("2. View Menu");
                System.out.println("3. Place Order");
                System.out.println("4. View Orders");
                System.out.println("5. Update Delivery Status");
                System.out.println("6. View Delivery Logs");
                System.out.println("7. Search Order");
                System.out.println("8. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {

                    //  Add Menu Item
                    case 1:
                        System.out.print("Enter Item ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Item Name: ");
                        String item = sc.nextLine();

                        System.out.print("Enter Price: ");
                        int price = sc.nextInt();

                        BufferedWriter bw1 = new BufferedWriter(
                                new FileWriter(menuFile, true));

                        bw1.write(id + "," + item + "," + price);
                        bw1.newLine();
                        bw1.close();

                        System.out.println(" Menu item added!");
                        break;

                    //  View Menu
                    case 2:
                        BufferedReader br1 = new BufferedReader(
                                new FileReader(menuFile));

                        String line1;
                        System.out.println("\n--- MENU ---");
                        while ((line1 = br1.readLine()) != null) {
                            System.out.println(line1);
                        }
                        br1.close();
                        break;

                    //  Place Order
                    case 3:
                        System.out.print("Enter Order ID: ");
                        int orderId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Customer Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Item Name: ");
                        String orderItem = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        System.out.print("Enter Price: ");
                        int pr = sc.nextInt();

                        int total = qty * pr;

                        BufferedWriter bw2 = new BufferedWriter(
                                new FileWriter(orderFile, true));

                        bw2.write(orderId + "," + name + "," + orderItem + "," + qty + "," + total);
                        bw2.newLine();
                        bw2.close();

                        System.out.println("Order placed! Total = " + total);
                        break;

                    //  View Orders
                    case 4:
                        BufferedReader br2 = new BufferedReader(
                                new FileReader(orderFile));

                        String line2;
                        System.out.println("\n--- ORDERS ---");
                        while ((line2 = br2.readLine()) != null) {
                            System.out.println(line2);
                        }
                        br2.close();
                        break;

                    //  Update Delivery Status
                    case 5:
                        System.out.print("Enter Order ID: ");
                        int did = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Status: ");
                        String status = sc.nextLine();

                        System.out.print("Enter Time: ");
                        String time = sc.nextLine();

                        BufferedWriter bw3 = new BufferedWriter(
                                new FileWriter(deliveryFile, true));

                        bw3.write(did + "," + status + "," + time);
                        bw3.newLine();
                        bw3.close();

                        System.out.println(" Delivery updated!");
                        break;

                    //  View Delivery Logs
                    case 6:
                        BufferedReader br3 = new BufferedReader(
                                new FileReader(deliveryFile));

                        String line3;
                        System.out.println("\n--- DELIVERY LOGS ---");
                        while ((line3 = br3.readLine()) != null) {
                            System.out.println(line3);
                        }
                        br3.close();
                        break;

                    // Search Order
                    case 7:
                        System.out.print("Enter Order ID: ");
                        int sid = sc.nextInt();

                        BufferedReader br4 = new BufferedReader(
                                new FileReader(orderFile));

                        String line4;
                        boolean found = false;

                        while ((line4 = br4.readLine()) != null) {
                            if (line4.startsWith(sid + ",")) {
                                System.out.println("Found: " + line4);
                                found = true;
                            }
                        }
                        br4.close();

                        if (!found) {
                            System.out.println(" Order not found!");
                        }
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println(" Invalid choice!");
                }

            } while (choice != 8);

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
            
	
}

