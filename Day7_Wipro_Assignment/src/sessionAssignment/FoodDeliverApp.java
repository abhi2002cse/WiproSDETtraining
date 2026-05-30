package sessionAssignment;

class OrderProcessor implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Thread 1 : Starting Order Processing...");
		try {
			Thread.sleep(2000);
			System.out.println("Thread 1 : Order Processed Successfully.");
		} catch(InterruptedException e) {
			System.out.println("Order Processing Interrupted.");
			
		}
	}
}


class PaymentProcess implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread 2 : Starting Payment Processing");
		try {
			Thread.sleep(3000);
			System.out.println("Thread 2 :  Payment received and verified");
		} catch(InterruptedException e) {
			System.out.println(" Payment processing Interrupted");
		}
	}
}



class NotificationService implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread 3 : Sending Notification .");
		try {
			Thread.sleep(1000);
			
			System.out.println("Thread 3 :  Notification sent to user and restaurant .");
		} catch(InterruptedException e) {
			System.out.println(" Notification service Interrupted.");
		}
	}
}

public class FoodDeliverApp {

	public static void main(String[] args) throws InterruptedException {
		
	OrderProcessor orderTask = new OrderProcessor();
	PaymentProcess payTask = new PaymentProcess();
	NotificationService notifytask = new NotificationService();
	
	Thread t1 = new Thread(orderTask);
	Thread t2 = new Thread(payTask);
	Thread t3 = new Thread(notifytask);
	
	t1.start();
	t1.join();
	
	t2.start();
	t2.join();
	
	t3.start();
	t3.join();
}
}
