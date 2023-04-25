<p align="center">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8dZYIID1DTJgWP4lnQRx7Zx_S3cQmbPwdGw&usqp=CAU" alt="Project Logo" width="726">
</p>

= Spring_МVC_Hibernate_AOP


An application project with the creation of a database management with the implementation of all CRUD-operations on all table members from the database.

== The main goals of the project:

*  Practice of creating a basic application with the ability to scale it further if desired.
* Deepening the understanding of the functioning of the spring application, its configuration and administration.
* Studying possible options for implementing an application using "the best practice"

== Frameworks and tools

* `IDE`: IntelliJ IDEA 2022.3.2 with JDK19
* `Backend`: Spring MVC 6.0.6  Hibernate 6.2.0 (Configured by XML-File + annotations)
* `Frontend` without a worthy representative
* `Database` mySQL
* `Web Server` Apache TomCat10
* `Build tool` Maven
* `Others` C3P0(Connection pool), Jakarta.servlet.jsp


== Project Description

* `basic` - Basic usage of Spring Data JDBC.
* `immutables` - Showing Spring Data JDBC usage
 with https://immutables.github.io/[Immutables]

== Spring Data JPA

* `eclipselink` - Sample project to show how to use Spring Data JPA with Spring Boot and https://www.eclipse.org/eclipselink/[Eclipselink].
* `example` - Probably the project you want to have a look at first. Contains a variety of sample packages, showcasing the different levels at which you can use Spring Data JPA. Have a look at the `simple` package for the most basic setup.
* `interceptors` - Example of how to enrich the repositories with AOP.
* `jpa21` - Shows support for JPA 2.1 specific features (stored procedures support).
* `multiple-datasources` - Examples of how to use Spring Data JPA with multiple `DataSource`s.
* `query-by-example` - Example project showing usage of Query by Example with Spring Data JPA.
* `security` - Example of how to integrate Spring Data JPA Repositories with Spring Security.
* `showcase` - Refactoring show case of how to improve a plain-JPA-based persistence layer by using Spring Data JPA (read: removing close to all of the implementation code). Follow the `demo.txt` file for detailed instructions.
* `vavr` - Shows the support of https://www.vavr.io[Vavr] collection types as return types for query methods.

== Spring Data LDAP

* `example` - Sample for Spring Data repositories to access an LDAP store.
