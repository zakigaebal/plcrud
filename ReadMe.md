# 개발환경
- jdk 1.8 - temurin
- intellij ultimate
- gradle
- springboot 2.7.5

## dependency
- mybatis
- swagger3
- lombok
- postgresql

# 테이블쿼리
```postgresql
member 테이블
create table members (id serial primary key, name varchar(50), job varchar(50))
insert into members(name, job) values('ss','bb')
select * from members;









```


# Todo
## 1
- springboot swagger - api, controller, response해보기
  - mybatis - postgresql 연동
  - crud controller 생성
- postgresql 테이블 member생성-로컬
  - crud api 연동
- 웹 템플릿 다운받고 연동하기
  1.  웹템플릿 정하기

  2. 다운받은 템플릿 연동하기
     - 템플릿엔진 사용하지않고 정적 컨테츠로 바로 보여주기
  
## 2
  - 게시판 쓸수 있는 템플릿 가져오기
  - 부트스트랩템플릿쓰기
  - 댓글과 대댓글도 할수 있는 게시판 만들기
  - ajax호출해서 crud가 될수 있도록 만들기
  - jquery 사용하기
  - jsp나 html로 만들기
  - pageController.java를 만들어서 /board/list로 보내면 list.jsp로 가게
  - crudController도 만드러야됨
- PageController.java
- /board/list -> list.jsp

     


# 참고자료
- 웹템플릿
  - https://startbootstrap.com/theme/freelancer
- 템플릿엔진 사용하지않고 정적 컨테츠로 바로 보여주기
  - https://velog.io/@falling_star3/Spring-Boot-%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9B%B9%EA%B0%9C%EB%B0%9C-%EA%B8%B0%EC%B4%88-%EC%A0%95%EC%A0%81-%EC%BB%A8%ED%85%90%EC%B8%A0-%EB%8F%99%EC%9E%91


### 고민
- swagger에서 테스트할때 post에서 기본으로 만들어지는 예제 수정해보고싶음
- 고민사항













