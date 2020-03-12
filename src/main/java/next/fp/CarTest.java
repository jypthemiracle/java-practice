package next.fp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest {
  @Test
  public void 이동() {
    Car car = new Car("pobi", 0);
    Car actual = car.move(() -> true); //람다를 사용한 경우
    assertEquals(new Car("pobi", 1), actual);
  }

  @Test
  public void 정지() {
    Car car = new Car("pobi", 0);
    Car actual;
    actual = car.move(new MoveStrategy() { //기존의 익명클래스로 사용했을 경우
      @Override
      public boolean isMovable() {
        return false;
      }
    });
    assertEquals(new Car("pobi", 0), actual);
  }
}
