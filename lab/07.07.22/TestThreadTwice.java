//No. After starting a thread, it can never be started again. 
//If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.
public class TestThreadTwice1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestThreadTwice1 t1=new TestThreadTwice1();  
  t1.start();  
  t1.start();  
 }  
}  