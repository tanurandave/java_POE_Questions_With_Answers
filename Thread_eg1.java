//25. Write a Java program to create a thread by extending the Thread class and by
//implementing the Runnable interface.
package POE_Questions;

class MyThread extends Thread {
    public void run() {
        for (int i = 5; i < 10; i++) {
            System.out.println("Thread using Thread class: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 5; i < 10; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
            	System.out.println(e);
            }
        }
    }
}

public class Thread_eg1 {

	public static void main(String[] args) {
		 MyThread thread1 = new MyThread();
	        thread1.start();

	        
	        MyRunnable runnable = new MyRunnable();
	        Thread thread2 = new Thread(runnable);
	        thread2.start();
	}

}
