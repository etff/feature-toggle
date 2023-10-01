## FEATURE TOGGLE(UNLEASH)
## Unleash
> https://github.com/Unleash/unleash
- 오픈소스
- 실제로 사용하고 있는 회사와 10개 이상 커뮤니티 SDK 존재
- 깃헙스타 9k+

## DOCS
- https://docs.getunleash.io/reference/sdks/java

## 실습
### 개발환경
- Docker
- Java 17
- Spring boot 3
### STEP1
```
git clone https://github.com/Unleash/unleash.git
cd unleash
docker-compose up -d
```
### STEP2
- http://localhost:4242 접속
- feature 신규 생성 ex) feature-001
- 작동할 환경 설경(develop, production)
- Toggle 설정

### STEP3 
- 프로젝트의 application.yml
```
io:
  getunleash:
    app-name: 
    instance-id: 
    environment: 
    api-url: 
    api-token: 
```
부분을 unleash 관리자 페이지에서 가져와 넣고 실행

### STEP4
- http://localhost:8080/toggle 에 접속하면
- 화면에 old-feature 가 출력된다.
```
old-feature
```
- unleash 관리자 페이지에서 toggle을 활성화한뒤 
http://localhost:8080/toggle 에 접속하면
실시간으로 feature-001이 활성화된다.
```
feature-001
```

