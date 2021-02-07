# rxjava-practice

# 리액티브 스트림즈란(Reactive Streams)?
## Reactive Streams란?
- 리액티브 프로그래밍 라이브러의 표준 사양
  (https://github.com/reactive-streams/reactive-streams-jvm/)
- 리액티브 프로그래밍에 대한 인터페이스만 제공
- Rxjava는 Reactive Streams의 구현체
- Publisher, Subscriber, Subscription, Processor 인터페이스를 제공 
  - Publisher : 데이터를 생성하고 통지
  - Subscriber : 통지된 데이터를 전달받아서 처리
  - Subscription : 전달 받을 데이터의 개수를 요청하고 구독을 해지
  - Processor : Publisher와 Subscriber의 기능이 모두 있음

## Publisher와 Subscriber간의 프로세스 흐름

## Cold Publisher & Hot Publisher
### Cold Publisher
### Hot Publisher
  
