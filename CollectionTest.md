### 컬렉션 테스트 ###

338p~340p에서 설명하고 있는 collcetion test에 대한 오류정정 내용

[정상혁님](http://me2day.net/benelog)께서 내용 문의 주셨습니다. 확인결과 알려주신 내용이 맞았고, 정정설명 드립니다.

## 정정 설명 ##

**assertEquals( arrayListA, arraryListB) 를 하게 될 때.**

assertEquals는 기본적으로 객체의 equals override 비교입니다.

그리고 List 계열의 equals는 말씀해 주신대로 AbstractList의 equals를 이용합니다.
즉 iterator로 내부 객체를 꺼내와서 equals비교를 하게 되어 있고요.

338페이지의 Case1 설명 문장은
**"기본적으로 컬렉션들은 안에 담겨 있는 객체들을 열거 형태로 꺼내서 순차적 equals 비교를 하게 되어 있다"**
로 변경되어야 합니다.

그리고 338p~340p까지의 부분도 마찬가지입니다.

제가 동치비교를 할 때는 toString을 이용하는 객체 메시지비교 방식을 선호하기 때문에 설명의 방향이 그렇게 흘러갔습니다. 중간 중간 틀린 문장은 오류페이지에 함께 정정해 놓겠습니다. (어딜 어떻게 바꾸어야 자연스럽게 될런지 조금 고민해야 할 것 같습니다.흠..)

책 앞 부분에서 객체 동치비교 설명을 할 때, toString을 이용하는 방식과 equals를 이용하는 방식을 이야기 했고, 개념적으로는 equals overriding으로 유도하는 것이 맞다고 이야기 했으나 굳이 추천마크를 달지 않은 이유는 equals와 hashcode 구현자체에 대한 부담 때문이었습니다. 이야기 주신대로 equals를 overriding하면 toString은 굳이 구현하지 않아도 무방합니다. 하지만, 사람의 인지적 특성으로 인해 객체 equals 구현 및 이해보다는 toString 메시지 비교가 더 쉽다는 점 때문에 전 테스트 케이스에서 사용하는 비교시에 toString 비교 쪽을 추천합니다. 조슈아가 이런 말을 하는 저를 보면 뭐라고 한참 잔소리를 하려 들지도 모르겠네요. :)

여튼, 큰 오해를 낳을 수 있을만한 부분을 상혁님께서 미리 지적해 주셔서 정말 감사합니다.

참고로 아래는 AbstractList 클래스의 equals 구현 코드 입니다.

```
public boolean equals(Object o) {
	if (o == this)             // 동일한 List 객체인가?
		return true;
	if (!(o instanceof List))  // List 계열인가?
		return false;

	ListIterator<E> e1 = listIterator();         //이터레이터로 추출
	ListIterator e2 = ((List) o).listIterator(); //비교대상도 이터레이터로 추출

	while(e1.hasNext() && e2.hasNext()) {
		E o1 = e1.next();
		Object o2 = e2.next();
		if (!(o1==null ? o2==null : o1.equals(o2) ))  // 컬렉션안의 객체끼리 다시 equals 비교
			return false;
	}
	return !(e1.hasNext() || e2.hasNext());
}
```

List 안에서 객체를 꺼내서 다시 그 객체를 equals비교하는 부분이 while문 중간에 보입니다.

컬렉션의 사이즈 비교는 (약간 트릭스럽지만) 맨 마지막 return 문장으로 인해 자연스럽게 판별됩니다. hasNext로 둘 중 하나라도 true가 나오면 ! 조건에 의해 false로 equals가 끝나게 되어 있습니다.