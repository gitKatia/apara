Start the application using Run as Spring Boot App in STS (Spring Tool Suite)

This project uses an embedded database (H2)

To login to the H2 console type:
http://localhost:9092/h2-console
and enter the credentials in application.properties (sa, sa)

For a first test of the service type in the browser or using Postman or Advanced Rest Client:

http://localhost:9092/employees
to retrieve all the employees

http://localhost:9092/employee/1
to retrieve employee with id 1

How to insert a new employee:

http://localhost:9092/employee
POST

example body:

{
  "firstname":"George",
  "lastname":"Anderson",
   "age":41
}
