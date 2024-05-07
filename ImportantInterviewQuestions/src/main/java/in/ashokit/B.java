package in.ashokit;

public class B {
    public static void main(String[] args) {
        // Creating and starting multiple threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new WorkerThread("Thread-" + (i + 1));
            thread.start(); // Start the thread
        }
    }

    // WorkerThread class implementing Runnable interface
    static class WorkerThread extends Thread {
        public WorkerThread(String name) {
        	 super(name);
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is executing.");
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has finished.");
        }
    }
}
