# Functional Programming

- 자바지기 박재성님이 작성하신 마스터즈 백엔드 레벨3의 자료입니다.

------

## 왜 함수형 프로그래밍을 배워야 하는가

------

![functional programming](http://www.hanbit.co.kr/data/ebook/E7510465152_l.jpg)

[왜 함수형 프로그래밍을 배워야 하는가? 샘플 Chapter](http://preview.hanbit.co.kr/1967/sample_ebook.pdf)

------

## 동시성 이슈

스마트폰까지 멀티 CPU를 가지고 있는 상황에서 동시성 이슈를 해결하면서 안정적인 소프트웨어를 개발하는 것에 대한 중요성이 높아졌다.

데이터의 상태를 변경하는 객체 지향 프로그래밍 방식으로 동시성 문제를 해결하는 데는 한계가 있다.

------

## 데이터 관리에 따른 부담

대용량 데이터를 다루는 작업이 점점 더 많아지고 있다. 대용량 데이터를 처리할 때 데이터를 객체로 변환하는데 따른 부담이 크다.

대용량 데이터를 처리할 수 있는 효율적인 데이터 구조와 데이터 연산이 필요하다.

------

## 함수형 프로그래밍과 모듈화

객체 단위의 모듈화는 가장 작은 단위의 모듈화가 아니다. 함수형 프로그래밍의 함수를 모듈화할 경우 수 많은 곳에 재사용할 수 있다.

함수형 프로그래밍은 더 유용하고, 재사용이 편리하고, 구성(compose)이 용이하고, 테스트하기 더 간편한 추상화를 제공한다.

------

## 빠른 작업 속도

소프트웨어 개발 흐름은 점점 더 빠른 결과물을 확인할 수 있기를 기대하는 방향으로 변화되고 있다.

객체에 대한 모델링에 많은 시간을 투자하기보다 사용자 요구사항에 대해서 최소한으로 충분한 수준을 유지하면서 동시에 변화에 대해서도 유연하게 대응하는데 도움을 준다.

------

## 단순함의로의 복귀

요구사항 자체가 본질적으로 가지고 있는 복잡성이 아니라 요구사항을 구현하기 위해 선택된 방식에서의 복잡성을 단순화할 수 있을 것으로 기대한다.

------

복잡한 문제를 작은 단위로 분리해 해결하는 능력이 프로그래머에게 특히 중요하다.

-*함수형 프로그래밍을 학습하면 문제에 접근하는 방법, 문제를 작은 단위로 쪼개는 방법, 설계하는 과정, 프로그래밍하는 순서에서 새로운 시각을 배울 수 있다.**

즉, 함수형 프로그래밍 방식을 학습하면 현재 프로그래밍 스타일을 개선해 더 깔끔한 코드(clean code)를 구현하는데 도움을 받을 수 있다.

------

## 함수형 프로그래밍의 특징

### 변경 불가능한 값(immutable value)을 활용

값이 변경되는 것을 허용하면 멀티 스레드 프로그래밍이 힘들다.

값을 변경할 수 없는 경우 프로그램의 정확성을 높여 버그의 발생 가능성을 줄인다.

------

### 1등 시민으로서의 함수

함수형 프로그래밍에서는 함수가 1등 시민의 역할을 한다.

함수를 1등 시민으로 활용이 가능할 경우 함수를 함수의 인자로 받거나 함수의 반환 값으로 활용하는 것이 가능하다.

------

## 람다와 클로저

- 람다는 익명 함수의 다른 표현이다. 즉, 함수는 함수인데 이름이 없는 경우를 의미한다.
- 클로저는 일급 객체인 함수가 외부 환경에 접근할 수 있는 XX(?)를 말한다.
- https://en.wikipedia.org/wiki/Closure_(computer_programming)

------

## 고계함수(higher-order functions)

고계함수란 다른 함수를 인수로 받아들이거나 함수를 리턴하는 함수이다. 자바 메소드는 인수나 반환 값으로 primitive type과 객체만 사용할 수 있다. 함수형 프로그래밍은 함수가 1급 시민이 될 수 있기 때문에 고계함수가 가능하다.

------

## 부수효과(side effect)가 없는 함수

함수가 불변(immutable)인 특성을 가지기 때문에 함수를 사용하는 입장에서 특별한 부수효과가 발생하지 않는다. 따라서 멀티 스레드 환경에서 안정적인 프로그래밍을 구현할 수 있다.

------

함수형 프로그래밍의 가장 핵심적인 특징은 **side effect를 만들지 않는 것**이다.

------

## 참고 자료

### [함수형 프로그래밍이란 무엇인가?](https://medium.com/@jooyunghan/함수형-프로그래밍이란-무엇인가-fab4e960d263)

> 모든 입력이 입력으로 선언되고 (숨겨진 것이 없어야 한다) 마찬가지로 모든 출력이 출력으로 선언된 함수를 ‘순수(pure)’하다고 부른다.
> 함수형 프로그래밍은 순수 함수를 작성하는 것, 그러니까 숨겨진 입력이나 출력을 최대한 제거하여 가능한한 우리 코드의 대부분이 단지 입력과 출력의 관계를 기술하게끔 하는 것을 말한다.

------

### 순수 함수 기반으로 구현할 때의 장점

> 더 복잡하지 않다. 의존성을 숨긴다고 더 간단해지지는 않는다. 의존성을 정직하게 드러낸다고 더 복잡해지지는 않는다.
> 훨씬 테스트하기 쉽다. 하루 중 어느 때든, 시차 변경이나 윤년을 테스트 하는 경우에도 원하는 시간을 넘겨주기만 하면 되므로 모두 간단하다. 나는 첫번째 버전의 코드가 실제 제품에 사용된 것을 본적이 있는데, 테스트를 위해 시스템 시간을 바꾸느라 별의별 트릭을 동원해야 했다. 인자로 바꿀 수만 있다면 필요한 노력이 얼마나 될지 상상해보라.
> 추론하기 더 쉽다. 이 함수는 단지 입력과 출력의 관계를 기술하고 있을뿐이다. 여러분이 입력을 알고 있다면 결과가 무엇이어야 하는지 모든 것을 알고 있다. 이것은 정말 대단한 것이다. 우리는 이 코드를 따로 떼어내어 확인할 수 있다. 입력과 출력 사이의 관계만 테스트하면 함수 전체를 테스트한 것이 된다.

------

### 함수형 프로그래밍 언어

- [어떤 프로그래밍 언어들이 함수형인가?](https://medium.com/@jooyunghan/어떤-프로그래밍-언어들이-함수형인가-fec1e941c47f)

------

## 실습 환경 세팅

- https://github.com/code-squad/java-practice 프로젝트를 clone 한다.
- Eclipse 또는 IntelliJ에 메이븐 또는 그래들 빌드 도구로 import한다.

------

## 람다, 스트림, Optional

- 람다: 익명함수
- 스트림: 콜렉션에 함수형 조작을 지원하기 위해 만들어짐
- Optionanl: null 처리 잘 하려고 생김

------

## 람다(lambda)

람다는 익명 함수의 다른 표현이다. 즉, 함수는 함수인데 이름이 없는 경우를 의미한다.

------

## Collection의 모든 값을 출력

```java
// next.fp.Lambda의 printAllOld method
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

for (int number : numbers) {
    System.out.println(number);
}
코드복사
```

------

## 람다가 없던 시절

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

numbers.forEach(new Consumer<Integer>() {
    public void accept(Integer value) {
        System.out.println(value);
    }
});
코드복사
```

------

## 람다를 활용하면…

```java
// next.fp.Lambda의 printAllLambda method
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

numbers.forEach((Integer value) -> System.out.println(value));
numbers.forEach(value -> System.out.println(value)); // Type 추론이 가능해 Type 생략 가능
numbers.forEach(System.out::println); // :: 연산자 활용 가능
= numbers.forEach(x -> System.out.println(x));
코드복사
```

------

## 람다 문법

input arguments -> body

------

## 람다 실습

- 다음 테스트 코드에서 MoveStrategy에 대한 익명 클래스로 구현하고 있는데 람다를 적용해 구현한다.

```java
// next.fp.CarTest의 이동, 정지 method
public class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return true;
            }
        });
        assertEquals(new Car("pobi", 1), actual);
    }
코드복사
```

------

```java
    @Test
    public void 정지() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return false;
            }
        });
        assertEquals(new Car("pobi", 0), actual);
    }
}
코드복사
```

------

## 람다를 통한 중복 제거

```java
// next.fp.Lambda의 sumAll method
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

public int sumAll(List<Integer> numbers) {
    int total = 0;
    for (int number : numbers) {
        total += number;
    }
    return total;
}
코드복사
```

------

```java
// next.fp.Lambda의 sumAllEven method
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

public int sumAllEven(List<Integer> numbers) {
    int total = 0;
    for (int number : numbers) {
        if (number % 2 == 0) {
            total += number;
        }
    }
    return total;
}
코드복사
```

------

### 요구사항

- List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
- 이 기능을 구현하려고 보니 앞의 요구사항 1,2와 많은 중복이 발생한다. 람다를 활용해 중복을 제거한다.
- `next.fp.Lambda`의 `sumAll, sumAllEven, sumAllOverThree` method 소스 코드를 확인하고 중복 제거한다.

------

### 힌트

- 변경되는 부분과 변경되지 않는 부분의 코드를 분리한다.
- 변경되는 부분을 인터페이스로 추출한다.
- 인터페이스에 대한 구현체를 익명 클래스(anonymous class)로 구현해 메소드의 인자로 전달한다.
- 구글에서 자바의 익명 클래스로 검색해 익명 클래스가 무엇인지 학습한다.
- 인터페이스는 다음과 같은 형태로 추출할 수 있다.

------

```java
public interface Conditional {
    boolean test(Integer number);
}
코드복사
```

- Conditional을 활용해 공통 메소드의 구조는 다음과 같다.

```java
public int sumAll(List<Integer> numbers,
    Conditional c) {
    // c.test(number)를 활용해 구현할 수 있다.
}
코드복사
```

- 익명 클래스를 자바 8의 람다를 활용해 구현한다.

------

## map, filter, reduce

------

- Collection에 담긴 데이터를 처리하려면 Collection을 순회하면서 각 Element를 처리하는 것이 일반적이다.
- 앞으로는 순회하는 것을 잊고, Element 처리에만 집중하자.

------

## filter

요구사항은 파일 문자 중 길이가 12보다 큰 문자의 수를 구한다.

```java
// next.fp.StreamStudy countWords method

String contents = new String(Files.readAllBytes(
  Paths.get("../ war-and-peace.txt")), StandardCharsets.UTF_8);
List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

long count = 0;
for (String w : words) {
  if (w.length() > 12) count++;  
}
코드복사
```

------

## filter 활용해 구현

```
String contents = new String(Files.readAllBytes(
  Paths.get("../alice.txt")), StandardCharsets.UTF_8);
List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

long count = 
  words.stream().filter(w -> w.length() > 12).count();
코드복사
```

------

## map

List에 담긴 모든 숫자 값을 2배한 결과 List를 생성한다.

```
// next.fp.StreamStudy 클래스의 doubleNumbers method 참고
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> dobuleNumbers =
  numbers.stream().map(x -> 2 * x).collect(Collectors.toList());
코드복사
```

------

## reduce

List에 담긴 모든 숫자의 합을 구한다.

```
// next.fp.StreamStudy 클래스의 sumAll method 참고

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

public int sumAll(List<Integer> numbers) {
    return numbers.stream().reduce(0, (x, y) -> x + y);
}
코드복사
```

------

## 다양한 stream method 실습

> src/main/resources/fp 디렉토리 아래에 있는 war-and-peace.txt 파일을 읽는다.

------

## map, reduce, filter 실습 1

List에 담긴 모든 숫자 중 3보다 큰 숫자를 2배 한 후 모든 값의 합을 구한다. 지금까지 학습한 map, reduce, filter를 활용해 구현해야 한다.

- next.fp.StreamStudyTest 클래스의 sumOverThreeAndDouble() 테스트를 pass해야 한다.

------

## map, reduce, filter 실습 2

next.fp.StreamStudy 클래스의 printLongestWordTop100() 메서드를 구현한다. 요구사항은 다음과 같다.

- 단어의 길이가 12자를 초과하는 단어를 추출한다.
- 12자가 넘는 단어 중 길이가 긴 순서로 100개의 단어를 추출한다.
- 단어 중복을 허용하지 않는다. 즉, 서로 다른 단어 100개를 추출해야 한다.
- 추출한 100개의 단어를 출력한다. 모든 단어는 소문자로 출력해야 한다.

------

## 스트림 실습 힌트

- 단어의 길이가 12자를 초과하는 단어를 추출한다.
- 12자가 넘는 단어 중 길이가 긴 순서로 100개의 단어를 추출한다.
- sorted() method 활용
- 단어 중복을 허용하지 않는다. 즉, 서로 다른 단어 100개를 추출해야 한다.- distinct() method 활용
- 추출한 100개의 단어를 출력한다. 모든 단어는 소문자로 출력해야 한다.
- String.toLowerCase() method 활용

------

## Optional 사용 실습

## 요구사항 1 - Optional 적용

> next.optional.ComputerStore의 getVersion() 메소드는 SoundCard, USB 존재 유무에 따라 version을 반환하는 메소드이다.
> 이와 같이 객체들이 서로 연관관계를 맺고 있는 경우 NullPointerException이 발생하지 않도록 하기 위해 매번 null 인지 여부를 체크해야 한다.
>
> 자바 8의 Optional을 적용해 getVersion() 메소드를 리팩토링한다.

------

## Optional 실습 힌트

- [Guide To Java 8 Optional](http://www.baeldung.com/java-optional) 문서를 참고해 Optional 사용 방법을 익힌다.
- getSoundcard()의 반환 값을 Optional로 반환하도록 변경한다.
- getUsb()의 반환 값을 Optional로 반환하도록 변경한다.
- Optional 내에 있는 값을 가져올 때 flatMap() 메소드를 사용해 다음과 같은 방식으로 구현한다.

```
computer
    .flatMap(Computer::getSoundcard)
    .flatMap(Soundcard::getUSB)
코드복사
```

------

- 아무리 해결책을 찾으려고 해도 해결책을 찾지 못하는 경우 참고
  - [Tired of Null Pointer Exceptions? Consider Using Java SE 8's Optional](http://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html)

------

## 요구사항 2 - Optional을 활용해 조건에 따른 반환

> next.optional.User의 ageIsInRange1() 메소드는 30살 이상, 45살 이하에 해당하는 User가 존재하는 경우 true를 반환하는 메소드이다.
> 같은 기능을 Optional을 활용해 ageIsInRange2() 메소드에 구현한다. 메소드 인자로 받은 User를 Optional로 생성하면 stream의 map, filter와 같은 메소드를 사용하는 것이 가능하다.
> next.optional.UserTest의 테스트가 모두 pass해야 한다.

------

## 요구사항 2 힌트

- [Guide To Java 8 Optional](http://www.baeldung.com/java-optional) 문서를 참고해 Optional 사용 방법을 익힌다.
- Optional.ofNullable(user)을 활용해 User을 Optional로 생성하는 것이 가능하다.
- Optional의 map(), filter() 메소드를 사용할 필요한 데이터를 추출
- Optional의 isPresent() 메소드 활용

------

## 요구사항 3 - Optional에서 값을 반환

> next.optional.Users의 getUser() 메소드를 자바 8의 stream과 Optional을 활용해 구현한다.
> 자바 8의 stream과 Optional을 사용하도록 리팩토링한 후 UsersTest의 단위 테스트가 통과해야 한다.

------

## 요구사항 3 힌트

- [Guide To Java 8 Optional](http://www.baeldung.com/java-optional) 문서를 참고해 Optional 사용 방법을 익힌다.
- Optional의 orElse() 메소드 활용해 구현한다.

------

## 요구사항 4 - Optional에서 exception 처리

> next.optional.ExpressionTest의 테스트가 통과하도록 Expression의 of 메소드를 구현한다.
>
> 단, of 메소드를 구현할 때 자바 8의 stream을 기반으로 구현한다.

------

## 요구사항 4힌트

- [Guide To Java 8 Optional](http://www.baeldung.com/java-optional) 문서를 참고해 Optional 사용 방법을 익힌다.
- 자바의 enum 전체 값은 values() 메소드를 통해 배열로 접근 가능하다.
- Arrays.stream()을 이용해 배열을 stream으로 생성할 수 있다.
- 일치하는 값 하나를 추출할 때 findFirst() 메소드를 활용 가능하다.
- Optional의 orElseThrow() 메소드 활용해 구현한다.