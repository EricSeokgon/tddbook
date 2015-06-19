**아래 오탈자는 2쇄에서는 모두 수정되었습니다.**

# 오탈자 안내 #
(오탈자로 불편함을 끼쳐드려 죄송합니다.)

**32p 세번째 줄**
```
 은행계좌(Balance Class) => 은행계좌(Account Class)
```
**43p 상단 그림속 소스에서 5번째줄** (by  jslivane님)
```
if( account != null){ => if( account == null) 
```
**59p 오류와 실패 이미지**
```
 오른쪽 이미지에 박스가 Errors에 그어져 있음. Failures :1에 그어져야 함
```
**68p 3,4번째줄** (by  jslivane님)
```
 assertEqauls => assertEquals
```
**81p 하단 소스코드 setUp 메소드명** (by  jslivane님)
```
 setUp => setup 
```
> (부연설명: convention rule을 따르기 위해 setup을 setUp으로 바꾸었는데 따로 설명을 기재하지 않았네요)
**143p 밑에서 두번째 줄** (by raccoonyy님)
```
 Matchters => Matchers
```
**187p Cipher interface의 메소드 명** (by jwlee1728님)
```
 encryption => encrypt, 
 decryption => decrypt 
```
**189p 소스코드 맨 마지막 줄**
```
 decrytedPassword => decryptedPassword
```
**196p 두 번째 문단 다섯 번째 줄**   (by [suakii](http://suakii.egloos.com/)님)
```
 할인율을 리턴값을 반환해줘야 => 할인율을 리턴값으로 반환해줘야
```
**199p 첫번째 코드에서 10번째줄** (by  jslivane님)
```
 userCoupon.getDiscountRate() => userCoupon.getName()
```
**200p 표 1행과 2행** (by raccoonyy님, mOer님, jslivane님)
```
 구폰 => 쿠폰, getDiscountRate => getDiscountPercent 
```
**204p 첫번째 이미지 설명**
```
 [UsetTest]를 작성할 때 => UserTest를 작성할 때
```
**207p 소스코드 중** (by [outsider](http://blog.outsider.ne.kr)님)
```
 ICoupon coupon = new StubCoupon()  => ICoupon coupon = new SpyCoupon()
```
**208p 마지막 문단** (by raccoonyy님)
```
 올바른 로직 수행에 판단의 근거로 => 올바른 로직 수행에 대한 판단 근거로 
```
**211p 동그라미 1번** (by raccoonyy님)
```
 1번 호출될 => 한 번 호출될
```
**220p IListener 인터페이스** (by mOer님)
```
 int getDocumentSize(String title); 가 추가되어야 함
```
**240p 위쪽 코드 결과 1행** (by raccoonyy님)
```
 Item => item
```
**247p 하단 소스코드 맨 마지막 줄**
```
 SoundType.LITTLE_NOISY => SoundType.NOISY
```
**268p 중간 데이터셋 코드 expected\_seller.xml** (by mOer님)
```
 item이란 테이블을 책 예제에서 사용한 적이 없으므로 <item /> 항목 삭제 
```
**282p 제일 마지막 문장** (by [suakii](http://suakii.egloos.com/)님)
```
 널값 제약(not null contraints) => not null constraint
```
**290p 중간 Book 클래스 소스코드** (by mOer님)
```
 super()메소드는 무의미함
```
> 이클립스의 코드 자동생성 기능을 이용해서 생성자를 만들때 끼어들어 갔습니다.p296 Player 클래스 소스코드의 super() 메소드도 마찬가지. 아무 의미가 없음.
**334p 주석4번**  (by [suakii](http://suakii.egloos.com/)님)
```
 재귀성(reflelectivity) => reflectivity
```
**338p 컬렉션 테스트 설명정정**([추가설명](CollectionTest.md))
  * Case1 설명
> 기본적으로 컬렉션들은 ~ 되어 있다.
> => 기본적으로 컬렉션들은 안에 담겨 있는 객체들을 열거 형태로 꺼내서 순차적 equals 비교를 하게 되어 있다. 기본형이나 문자열은 equals 비교시에 마치 값 비교처럼 동작하기 때문에 특별한 조작없이 assertEquals로 비교가능하다.
  * Case2 설명
> 그리고 equals... (코드 나오기 전까지)=> 그리고 컬렉션은 equals 비교시에 원소를 하나씩 꺼내서 다시 각각에 대해 equals 비교를 한다. 그런데 담긴 객체가 이미 equals를 중첩구현해 놓았다면 문제가 없지만, 그렇지 않을경우 제대로 비교가 안된다. 이럴때는 toString 메소드를 이용해서 문자열로 비교할 수 있게 하면 편하다.

  * 밑에서 세 번째 줄 '~ toString 값으로 비교한다'뒤에 (주석)
> 컬렉션들의 상위클래스에 해당하는 AbstractCollection 클래스의 toString 메소드는 내부 원소들의 toString 값을 [ ]안에 나열하도록 구현되어 있다.

**340p 중간**
  * [변정훈, 정선아]와 => [변정훈, 조연희]와
  * 이유는 ~ 때문이다. => 이유는 여전히 ArrayList 클래스의 equals가 사용되어서 listA와 listB에 포함된 객체가 각각 순차적으로 equals로 비교되고 있기 때문이다. assertEquals의 메시지는 실패시에 표시되는 toString 메시지이다.
**373p 중간 코드의 메소드 이름 띄어쓰기**
```
 test GetActualShippingList => testGetActualShippingList
```
**405p 맨 위 소스 2행** (by raccoonyy님)
```
 new Account(Integer.) => new Account(-1000)
```
> 참고로, 위 예제 코드에서 자바 assert 문을 동작시키기 위해서는 -ea 옵션을 실행시에 붙여주셔야 합니다. ea는 enableassertions 옵션의 간략버젼 입니다.
**405p 저자한마디 중 두 번째 문단**
```
 간결한 언어를 지양하는 => 간결한 언어를 지향하는
```
**406p 위에서 세번째 줄**
```
 unsigned 어떻게 되고 => unsigned가 어떻게 되고
```
**436p 밑에서 두 번째 줄** (by [정상혁](http://me2day.net/benelog)님)
```
 closer => closure
```
**451p 두 번째 질문 6번째 줄**   (by [suakii](http://suakii.egloos.com/)님)
```
 리팩토링 통해 테스트가 => 리팩토링을 통해 테스트가
```
**514p 아래에서 세 번째 줄**  (by [성현](http://me2day.net/bluesky_lim)님)
```
 Atlassian Cover => Atlassian Clover 
```