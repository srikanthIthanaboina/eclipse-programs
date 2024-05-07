package synchronizationExam;

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads to increment the counter concurrently
        IncrementerThread thread1 = new IncrementerThread(counter);
        IncrementerThread thread2 = new IncrementerThread(counter);

        thread1.start();
        thread2.start();

        // Waiting for both threads to finish
       thread1.join();
        thread2.join();

        // Displaying the final count
        System.out.println("Final Count: " + counter.getCount());
        System.out.println('j'+'a'+'v'+'a');
        
        //compiletime error
      //  int x = "Hello, World!";  // Type mismatch: cannot convert from String to int
        //System.out.println(x);
        
        int[] numbers = {1, 2, 3, 4, 5};
        // This line will cause a runtime error (ArrayIndexOutOfBoundsException)
        int element = numbers[10];
        System.out.println(element);
    }
}
