# BackendCodeChallenge

Solution:
The components used for the solution:
Spring Boot: starter web and starter test
JPA: for database related functionality
Thymeleaf: to design sample web page to make GET request
H2 database: to store application information in the in-memory database

To run the application:
Find the main Spring Boot class from the src/main/java with in the package “com.anil.codechallenge”
Simply right click on it -> Run As -> Spring Boot App
Enter “localhost:8080” in the browser and provide the mandatory information
Select a file
Enter username as “anil”
Enter password as “anil”
After the submission, a JSON object of ApplicationDetail will be shown in the browser

Challenge Faced
Passing file and user-information using GET request as the GET method usually does not contains any body
Testing the GET endpoint by mocking the request using MockMvc because a model needs to be passed as the body for the request

