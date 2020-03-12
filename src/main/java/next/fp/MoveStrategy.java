package next.fp;

@FunctionalInterface //lambda로 쓸거야. 함수는 하나만 사용 가능.
public interface MoveStrategy {
    boolean isMovable();
    //boolean isasdfable(); 이러면 오류가 발생한다. 한 개의 함수만 있을 수 있다.
}