package sessionAssignment;

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println(Thread.currentThread().getName() + " finished work");
    }
}

public class ThreadMethods {

	 public static void main(String[] args) throws InterruptedException {

	        
	        MyTask task = new MyTask();

	        // Create threads
	        Thread t1 = new Thread(task);
	        Thread t2 = new Thread(task);

	        // setName()
	        t1.setName("Thread-A");
	        t2.setName("Thread-B");

	        // setPriority()
	        t1.setPriority(Thread.MAX_PRIORITY);
	        t2.setPriority(Thread.MIN_PRIORITY);

	        // getName()
	        System.out.println("Starting " + t1.getName());
	        System.out.println("Starting " + t2.getName());

	        // start()
	        t1.start();
	        t2.start();

	        // isAlive()
	        System.out.println(t1.getName() + " alive? " + t1.isAlive());

	        // join()
	        t1.join();
	        t2.join();

	        // check again
	        System.out.println(t1.getName() + " alive after join? " + t1.isAlive());

	        System.out.println("Main thread finished");
	    }

}
