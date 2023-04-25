<p align="center">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8dZYIID1DTJgWP4lnQRx7Zx_S3cQmbPwdGw&usqp=CAU" alt="Project Logo" width="726">
</p>

## Spring_МVC_Hibernate_AOP


An application project with the creation of a database management with the implementation of all CRUD-operations on all table members from the database.

## The main goals of the project:

*  Practice of creating a basic application with the ability to scale it further if desired.
* Deepening the understanding of the functioning of the spring application, its configuration and administration.
* Studying possible options for implementing an application using "the best practice"

## Frameworks and tools

* `IDE`: IntelliJ IDEA 2022.3.2 with JDK19
* `Backend`: Spring MVC 6.0.6  Hibernate 6.2.0 (Configured by XML-File + annotations)
* `Frontend` without a worthy representative
* `Database` mySQL
* `Web Server` Apache TomCat10
* `Build tool` Maven
* `Others` C3P0(Connection pool), Jakarta.servlet.jsp

## About

*  since my front-end development skills do not yet allow me to create high-quality visual support for the project, my view looks something like this:

<p align="center">
      <img src="https://github.com/AntsipinDzmitry/spring_mvc_hibernate_aop/blob/master/.idea/Part1.gif" alt="Project Logo" width="620">
</p>

*  I did not use spring boot in the project for a deeper dive into the practice of writing code and additional understanding of the internal processes of interaction between parts of the application
*  the process of regulating and managing transactions is outsourced to a transaction manager
*  to be able to scale the application and follow the best practices, the following application structure is built:

<p align="center">
      <img src="https://github.com/AntsipinDzmitry/spring_mvc_hibernate_aop/blob/master/.idea/Part2.png" alt="Project Logo" width="620">
</p>

*  in the project I use the service class that implements the business logic and serves as an intermediary between the controller and the DAO
*  as AOP added "around"  aspect to implement the separation of auxiliary and business logic in the application to avoid "Code tangling" and "Code scattering"
