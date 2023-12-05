## ERD  

<img width="715" alt="스크린샷 2023-12-04 오후 10 19 59" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/ecc68800-09a4-4a65-ab00-1c08a65b268a">

## 테이블 정의서  

## 시스템 구성도

![서비스 아키텍처](https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/33d9070f-b345-4845-84fd-6eb8fc9d150a)


## 기능정의서  

### Member (회원)
<img width="651" alt="스크린샷 2023-12-05 오후 4 23 29" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/bbb4f3be-c034-4e04-9888-0f657b0cbf41">

### Book (도서)
<img width="651" alt="스크린샷 2023-12-05 오후 4 23 40" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/782a1c54-fcb6-4603-a99c-506c39aae911">


### BookHistory (대출 이력)
<img width="648" alt="스크린샷 2023-12-05 오후 4 23 51" src="https://github.com/CMHyuk/rmsoft_assignment/assets/97818720/888484c7-b242-4e66-a435-0026354f10ad">


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
1. 깃허브상으로 코드를 Push 하게 되면 GitHub Actions이 자동으로 실행되어 CI (빌드) 작업을 수행하게 됩니다.
2. 코드상에 문제가 없다면 이때 빌드 작업을 통해 jar파일이 생성되게 되고 사전에 작성한 배포 스크립트 파일과 함께 AWS의 스토리지 서비스인 S3에게 전달되어 저장되게 됩니다.
3. S3에 성공적으로 저장되었다면 EC2에 설치한 CodeDeply Agent가 S3에 저장된 프로젝트 파일을 가져와서 내려받습니다.
4. 그 후, 배포 스크립트 파일을 읽어 들여서 프로젝트 실행을 시작합니다.
   
   