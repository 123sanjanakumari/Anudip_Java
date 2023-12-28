package Thread;

class Num implements Runnable {

   
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}

class Alpha implements Runnable {

   
    public void run() {
        char[] arr = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}

public class Thread_1 {
	 public static void main(String[] args) {
	        Num t1 = new Num();
	        Alpha t2 = new Alpha();
	        Thread T1=new Thread(t1);
	        T1.start();
	        Thread T2=new Thread(t2);
	        T2.start();
	        

	    }
}
