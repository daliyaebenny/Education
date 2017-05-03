Pre requisites

Java JDK,Eclipse (Maven and TestNG plugin),restClient/postman 

Steps 

1.Import project to eclipse workspace

2.Project->run As -> Maven build (goal :"spring-boot:run") 

3.Open rest client or postman

  a. For Registration
  
  Param:
  {
   "fName": "Daliya",
    "lName": "Benny",
    "eMail": "daliyaebenny@gmail.com",
    "phoneNo":"5678901234",
    "password":"Daliya.Benny5%"
 }
 
 Method :POST
 
 url:http://localhost:8080/RegistrationApplication/api/user/
 
 Header :ContentType - Application/json
 
 b. For Login
 
 Method :GET
 
 url :http://localhost:8081/LoginApplication/api/user/daliyaebenny@gmail.com/Daliya.Benny5%
 
 Header :ContentType - Application/json
 
 

