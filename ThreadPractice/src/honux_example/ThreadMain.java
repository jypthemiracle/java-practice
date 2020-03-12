package honux_example;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {

  public static void main(String[] args) throws InterruptedException {
    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < CountingThread.NUM_THREAD; i++) {
      Thread t = new CountingThread();
      threads.add(t);
    }
    for (Thread t : threads) {
      System.out.println("start");
      t.start();
    }
    for (Thread t : threads) {
      t.join();
    }
    System.out.println("Result: " + CountingThread.count);
  }
}