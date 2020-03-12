package honux_example;

public class CountingThread extends Thread {

  public static long count = 0;
  public static long max = 1000 * 1000 * 1000;
  public static final int NUM_THREAD = 4;

  public static synchronized void plusCount() {
    count++;
  }

  @Override
  public void run() {
    for (long i = 0; i < max / NUM_THREAD; i++) {
      CountingThread.plusCount();
    }
  }
}