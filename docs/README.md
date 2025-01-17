## 기능 요구 사항

1. 입력 기능
   - 경주 자동차 이름 입력 (이름은 쉼표(,) 기준으로 구분)
   - 시도할 회수 입력 (숫자)
2. 자동차 기능
   - 자동차 전진 기능: 0에서 9 사이의 무작위 값을 구한 후, 값이 4 이상일 경우에만 전진.
   - 자동차 멈추는 기능: 무작위 값이 4 미만일 경우.
3. 출력 기능
   - 각 차수별 실행 결과 출력 기능. 
   - 단독 우승자 안내 문구 출력 기능. 
   - 공동 우승자 안내 문구 출력 기능.
4. 검증 기능 
   - 자동차 이름이 5자 이하인지 검증하는 기능. 
   - 잘못된 값이 입력될 경우 IllegalArgumentException 발생시키는 기능.
5. 경주 기능 
   - 주어진 횟수 동안 모든 자동차들에 대해서 전진 또는 멈추게 하는 기능. 
   - 모든 경주가 끝나고 최종 우승자(들)를 결정하는 기능.
6. 테스트 기능
   - 모든 기능에 대해 단위 테스트를 작성하고, 테스트가 성공하는지 확인하는 기능. 
   - JUnit 5와 AssertJ 라이브러리를 사용하여 테스트 구현.

## 공통 피드백 (확인하면서 코딩하기!)

1. 요구사항을 정확히 준수한다.
2. 커밋 메세지를 의미 있게 작성한다. 
3. git을 통해 관리할 자원에 대해서 고려한다.
4. Pull Request를 보내기 전에 브랜치를 확인한다. 
5. PR을 한 번 작성했다면 닫지 말고 추가 커밋을 한다. 
6. 이름을 통해 의도를 드러낸다. 
7. 축약하지 않는다.
8. 공백도 코딩 컨밴션이다.
9. 공백 라인을 의미 있게 사용한다. 
10. space와 tab을 혼용하지 않는다.
11. 의미 없는 주석을 달지 않는다.
12. IDE의 코드 자동 정렬 기능을 활용한다. 
13. Java에서 제공하는 API를 적극 활용한다.
14. 배열 대신 Java Collection를 사용한다. 

## 프로그래밍 요구 사항 

- JDK 17 버전에서 실행 가능해야 한다. **JDK 17에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- 프로그램 실행의 시작점은 `Application`의 `main()`이다.
- `build.gradle` 파일을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- [Java 코드 컨벤션](https://github.com/woowacourse/woowacourse-docs/tree/master/styleguide/java) 가이드를 준수하며 프로그래밍한다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.


## 과제 진행 요구 사항

- 미션은 [java-racingcar-6](https://github.com/woowacourse-precourse/java-racingcar-6) 저장소를 Fork & Clone해 시작한다.
- **기능을 구현하기 전 `docs/README.md`에 구현할 기능 목록을 정리**해 추가한다.
- **Git의 커밋 단위는 앞 단계에서 `docs/README.md`에 정리한 기능 목록 단위**로 추가한다.
    - [커밋 메시지 컨벤션](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 가이드를 참고해 커밋 메시지를 작성한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고한다.
