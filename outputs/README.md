## ERD  

<img width="711" alt="스크린샷 2023-12-06 오후 3 51 22" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/27d6127c-5a9b-4412-b595-f35165098eec">

## 테이블 정의서  

### Member (회원)
<img width="651" alt="스크린샷 2023-12-05 오후 4 23 29" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/bbb4f3be-c034-4e04-9888-0f657b0cbf41">

### Book (도서)
<img width="651" alt="스크린샷 2023-12-06 오후 3 58 07" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/0b7cbc5f-0dee-4f9c-9fde-7bcab1113de3">

### BookHistory (대출 이력)
<img width="647" alt="스크린샷 2023-12-06 오후 3 58 24" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/283047f3-ed11-4960-bc14-3393c206703c">

## 시스템 구성도

![서비스 아키텍처](https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/33d9070f-b345-4845-84fd-6eb8fc9d150a)


## 기능정의서  

<img width="562" alt="스크린샷 2023-12-06 오후 2 51 01" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/517924f2-8af2-46d2-b454-96710a69d2a7">

<img width="472" alt="스크린샷 2023-12-06 오후 3 54 06" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/32682b82-217e-43c4-a6ec-b69df0262a3e">

<img width="603" alt="스크린샷 2023-12-06 오후 3 55 08" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/8480eecd-148e-43cd-b293-e73772998df9">



## github( 본인의 개발위치 )  
https://github.com/CMHyuk/rmsoft_assignment

## AWS 구성 내역 사진 ( Free tier를 이용 )

### EC2
<img width="1111" alt="스크린샷 2023-12-05 오후 3 39 06" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/5637444d-a7f2-4e83-86b6-82d061090975">


<img width="1111" alt="스크린샷 2023-12-05 오후 3 39 23" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/a568b03e-7060-4de6-a408-faade5c99a64">


### RDS
<img width="1043" alt="스크린샷 2023-12-05 오후 3 55 27" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/ec3bd3fd-3faf-435b-b7b7-037bf56fcc0a">

<img width="1043" alt="스크린샷 2023-12-05 오후 3 55 41" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/b40aab15-bbdd-4ee1-a9cb-dcf3e10e59e3">


## AWS 내부 구축 내용
EC2와 IAM: AWS EC2 인스턴스는 CodeDeploy 에이전트가 설치된 호스트로, IAM 역할을 통해 S3 버킷 및 CodeDeploy에 필요한 권한을 부여받습니다.  

CodeDeploy: GitHub 레포지토리에서 코드 변경 사항을 감지하고, 빌드된 아티팩트를 EC2 인스턴스로 배포합니다.  

RDS: 애플리케이션 데이터베이스로 사용됩니다.  

S3: 소스 코드 저장과 배포를 위한 버킷으로 사용됩니다.
   
   