# producer-consumer 미션 요구사항

## 1단계
1. 사용자가 결제를 요청할 수 있다.

* 결제의 종류는 카드결제와 현금결제 두가지다.
* 카드결제 이벤트는 카드사 이름과 결제금액만 받아서 결제한다.
* 현금결제는 결제금액, 이름을 받아 결제한다.

2. 받은 결제 요청을 비동기로 처리한다.

* 카드결제와 현금결제는 각각 스레드 1개씩으로 처리한다.
* 이벤트를 소모하기 시작할때 로그로 남겨놓는다.
* 결제 요청이 100개 이상 쌓여있는 상태에서 들어오는 요청은 실패처리한다.

3. 결제가 성공하면 디비에 저장한다.
* 카드결제이력과 현금결제이력을 따로 관리한다.

## 2단계
1. 각각 받은 요청은 실패할 수 있다.
* 실패가 일어나면 다시 큐에 넣어준다.
* 현금결제는 2번 카드결제는 3번까지 재시도 후 실패하면 그때 디비에 실패상태를 기록한다.
2. 카드결제와 현금결제의 스레드는 언제든지 추가될 수 있다.
* 현재 카드결제와 현금결제는 각각 1개의 스레드로 운영된다.
* 하지만 다시 어플리케이션을 돌릴때 카드결제는 2개의 스레드 현금결제는 1개의 스레드로 운영될 수 있는 환경이어야한다.
3. 컨슈머에 대한 테스트 코드는 필수

## 참고자료
* https://github.com/Java-Bom/producer-consumer
* https://javabom.tistory.com/54
