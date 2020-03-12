package next.fp;

import static next.fp.Lambda.sumAllEven;

import java.util.Arrays;
import java.util.List;

public class sumMethod {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    sumAllEven(numbers);
  }

  public static int conditionalSum(List<Integer> numbers, Conditional c) {
    int total = 0;
    for (int number: numbers){
      if (c.test(number)) {
        total += number;
      }
    }
    return total;
  }

  public static int sumAll(List<Integer> numbers) {
      return conditionalSum(numbers, (n) -> true); //true일 때 넘겨준다. 하나씩 number를 넘긴다.
  }


  public static int sumAllEven(List<Integer> numbers) {
    return conditionalSum(numbers, (n) -> (n % 2 == 0)); //true일 때 넘겨준다. 하나씩 number를 넘긴다.
  }

  public static int sumAllOverThree(List<Integer> numbers) {
    return conditionalSum(numbers, (n) -> (n > 2));
  }
}