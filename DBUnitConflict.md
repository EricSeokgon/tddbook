# p303 @DataSet 예제가 실패할 경우 #
> (by mOer님 제보)

테스트가 계속 실패합니다.
원인을 찾아보니 DbUnit 2.4.7과 Unitils-DbUnit-3.1 (현재 최신버전들) 사용시 발생하는 에러인 것 같더라구요.

PostgreSQL을 사용할 땐 테이블을 찾을 수 없다고 하고, MySQL 사용할 땐 결과가 없다고 에러났습니다.

해결책은 이 곳( http://blog.javapia.co.kr/67 )에서 찾았는데, DbUnit을 2.2.2 버전으로 낮추면
잘 돌아갑니다만 2.2.2 버전에 FlatXmlDataSetBuilder 클래스가 없어서
```
new FlatXmlDataSet(File ...) ; 
```
식으로 코드를 바꿔줘야 했습니다.