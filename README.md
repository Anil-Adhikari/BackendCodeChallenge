# BackendCodeChallenge

## Solution:</br>
The components used for the solution:</br>
Spring Boot: starter web and starter test</br>
JPA: for database related functionality</br>
Thymeleaf: to design sample web page to make GET request</br>
H2 database: to store application information in the in-memory database</br>

## To run the application:</br>
Find the main Spring Boot class from the src/main/java with in the package “com.anil.codechallenge”</br>
Simply right click on it -> Run As -> Spring Boot App</br>
Enter “localhost:8080” in the browser and provide the mandatory information</br>
Select a file</br>
Enter username as “anil”</br>
Enter password as “anil”</br>
After the submission, a JSON object of ApplicationDetail will be shown in the browser</br>

## Challenge Faced:</br>
Passing file and user-information using GET request as the GET method usually does not contains any body</br>
Testing the GET endpoint by mocking the request using MockMvc because a model needs to be passed as the body for the request</br>

