package sessionAssignment;

class FoodDelivery extends Thread {

    private static final Object lock = new Object();

    // flags to control order
    private static boolean orderDone = false;
    private static boolean kitchenDone = false;

    public FoodDelivery(String name) {
        setName(name);
    }

    public void run() {

        synchronized (lock) {

            try {

                // Order thread
                if (getName().equals("Order")) {

                    System.out.println(getName() + " started");
                    Thread.sleep(2000);
                    System.out.println(getName() + " completed");

                    orderDone = true;
                    lock.notifyAll();
                }

                // Kitchen thread
                else if (getName().equals("Kitchen")) {

                    while (!orderDone) {
                        lock.wait(); // waiting for order to be completed
                    }

                    System.out.println(getName() + " started");
                    Thread.sleep(2000);
                    System.out.println(getName() + " completed");

                    kitchenDone = true;
                    lock.notifyAll();
                }

                // Delivery thread
                else if (getName().equals("Delivery")) {

                    while (!kitchenDone) {
                        lock.wait(); // waiting for kitchen works to be completed
                    }

                    System.out.println(getName() + " started");
                    Thread.sleep(2000);
                    System.out.println(getName() + " completed");
                }

            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class SynchronizingThreads {
	
	public static void main(String[] args) {

        FoodDelivery order = new FoodDelivery("Order");
        FoodDelivery kitchen = new FoodDelivery("Kitchen");
        FoodDelivery delivery = new FoodDelivery("Delivery");

        // priorities 
        order.setPriority(Thread.MAX_PRIORITY);
        kitchen.setPriority(Thread.NORM_PRIORITY);
        delivery.setPriority(Thread.MIN_PRIORITY);

        
        order.start();
        kitchen.start();
        delivery.start();

    
    }

}
