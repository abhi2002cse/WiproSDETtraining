package SessionAssignment;

import java.io.*;
import java.util.*;

public class BankingApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            File accountFile = new File("account.txt");
	            File transactionFile = new File("transactions.txt");
	            File tempFile = new File("temp.txt");

	            //  Create account file if not exists
	            if (!accountFile.exists()) {
	                accountFile.createNewFile();
	                BufferedWriter init = new BufferedWriter(new FileWriter(accountFile));
	                init.write("101,Abhishek,5000");
	                init.newLine();
	                init.write("102,Rahul,3000");
	                init.newLine();
	                init.close();
	                System.out.println("account.txt created with default data");
	            }

	            //  Create transaction file if not exists
	            if (!transactionFile.exists()) {
	                transactionFile.createNewFile();
	            }

	            // Take input
	            System.out.print("Enter Account Number: ");
	            int accNo = sc.nextInt();

	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            int choice = sc.nextInt();

	            System.out.print("Enter Amount: ");
	            int amount = sc.nextInt();

	            BufferedReader br = new BufferedReader(new FileReader(accountFile));
	            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

	            String line;
	            boolean found = false;

	            while ((line = br.readLine()) != null) {

	                String data[] = line.split(",");

	                int fileAccNo = Integer.parseInt(data[0].trim());
	                String name = data[1].trim();
	                int balance = Integer.parseInt(data[2].trim());

	                if (fileAccNo == accNo) {
	                    found = true;

	                    if (choice == 1) {
	                        balance += amount;

	                        // write transaction
	                        BufferedWriter tWriter = new BufferedWriter(
	                                new FileWriter(transactionFile, true));
	                        tWriter.write(accNo + " Deposited " + amount);
	                        tWriter.newLine();
	                        tWriter.close();

	                    } else if (choice == 2) {
	                        if (balance >= amount) {
	                            balance -= amount;

	                            BufferedWriter tWriter = new BufferedWriter(
	                                    new FileWriter(transactionFile, true));
	                            tWriter.write(accNo + " Withdraw " + amount);
	                            tWriter.newLine();
	                            tWriter.close();

	                        } else {
	                            System.out.println("Insufficient Balance!");
	                        }
	                    }

	                    System.out.println("Updated Balance: " + balance);
	                }

	                // write updated data
	                bw.write(fileAccNo + "," + name + "," + balance);
	                bw.newLine();
	            }

	            br.close();
	            bw.close();

	            // replace old file
	            accountFile.delete();
	            tempFile.renameTo(accountFile);

	            if (!found) {
	                System.out.println("Account not found!");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        sc.close();
	    }
	}

