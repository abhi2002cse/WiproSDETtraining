package ecommerce;

import java.io.*;
import java.util.*;

public class EcomApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            //  Files
            File orderFile = new File("orders.txt");
            File invoiceFile = new File("invoice.txt");
            File shippingFile = new File("shipping.txt");

            //  Auto-create files if not exist
            if (!orderFile.exists()) orderFile.createNewFile();
            if (!invoiceFile.exists()) invoiceFile.createNewFile();
            if (!shippingFile.exists()) shippingFile.createNewFile();

            //  User Input
            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();

            System.out.print("Enter Product: ");
            String product = sc.next();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price: ");
            int price = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            //  Calculate total
            int total = qty * price;

            //  Save Order
            BufferedWriter orderWriter = new BufferedWriter(
                    new FileWriter(orderFile, true));
            orderWriter.write(orderId + "," + product + "," + qty + "," + price);
            orderWriter.newLine();
            orderWriter.close();

            //  Save Invoice
            BufferedWriter invoiceWriter = new BufferedWriter(
                    new FileWriter(invoiceFile, true));
            invoiceWriter.write(orderId + "," + total);
            invoiceWriter.newLine();
            invoiceWriter.close();

            //  Save Shipping Details
            BufferedWriter shippingWriter = new BufferedWriter(
                    new FileWriter(shippingFile, true));
            shippingWriter.write(orderId + "," + name + "," + address);
            shippingWriter.newLine();
            shippingWriter.close();

            //  Output
            System.out.println("\n✅ Order Placed Successfully!");
            System.out.println("Order ID: " + orderId);
            System.out.println("Total Amount: " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
