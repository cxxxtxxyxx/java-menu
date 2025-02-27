## 기능 구현 리스트

- [x] 점심 메뉴 추천 프로그램 시작 알리는 문구 출력 기능 구현
- [x] 코치의 이름을 입력받는 기능 구현
  - [x] ","로 구분, 올바르지 않은 형식일 때 예외 처리하는 기능 구현
  - [x] 이름이 중복될 시 예외처리하는 기능 구현
  - [x] 코치가 2명 ~ 5명을 벗어나면 예외 처리하는 기능 구현
  - [x] 코치 이름이 2글자 이상 4글자 이하가 아니면 예외 처리하는 기능 구현
- [x] 입력받은 각 코치들이 못먹는 메뉴 입력받는 기능 구현
  - [x] 못먹는 메뉴가 없을 시 빈 값 입력하는 기능 구현
  - [x] 못먹는 메뉴가 0~2개 범위를 넘을 시 예외 처리하는 기능 구현
  - [x] 존재하지 않는 메뉴 입력 시 예외 처리 기능 구현 
- [x] 메뉴 추천 프로그램 실행하는 기능 구현
- [x] 메뉴 추천 결과 출력하는 기능 구현
- [x] 프로그램 종료 알리는 문구 출력하는 기능 구현
- [x] import문 순서 정리
- [x] 코드 스타일 적용
- [x] 사용하지 않는 메소드 제거



---

- 코치들은 월, 화, 수, 목, 금요일에 점심 식사를 같이 한다.
  - 메뉴를 추천하는 과정은 아래와 같이 이뤄진다.
    월요일에 추천할 카테고리를 무작위로 정한다.
    각 코치가 월요일에 먹을 메뉴를 추천한다.
    화, 수, 목, 금요일에 대해 i, ii 과정을 반복한다.
- 코치의 이름은 최소 2글자, 최대 4글자이다
- 코치는 최소 2명, 최대 5명까지 식사를 함께 한다.
- 각 코치는 최소 0개, 최대 2개의 못 먹는 메뉴가 있다. (, 로 구분해서 입력한다.
  - 먹지 못하는 메뉴가 🔥없으면🔥 빈 값을 입력한다
  - 추천을 못하는 경우는 고려하지 않는다
- 한 주에 같은 카테고리는 최대 2회까지만 고를 수 있다.
- 각 코치에게 한 주에 중복되지 않는 메뉴를 추천해야 한다
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.