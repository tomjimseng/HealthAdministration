# HealthAdministration
Healthcare Administration Full Stack Java Project

Link to GitHub:
[Thomas Seng](https://github.com/tomjimseng)

## Introduction

This is a full stack java project built with Spring Boot, Java, HTML, CSS, and Javascript. [Fontawesome](https://fontawesome.com/) was used for the small icons next to each form text box. Spring Boot was used to structure the project and build the framework for Controllers, Services, and Models. HTML pages were used with thymeleaf to implemeent the front-end of the project and provide navigation across pages. Navigation within the program if fairly simple and form completion utilizes modals from Bootstrap. CSS was used to style components that are more appealing to the user. Javascript was then created to load data within modals for updates and form completion. The end product is a complete Healthcare System Application that can be used to organize employees, patients, appointments, login information, and Inquiries.

## User Stories
    -As a user I want to add, update, and delete Patients on a list that is displayed on the web app
    -As a user I want to login in and keep my login information secure
    -As a user I want to add, update, and delete Employees on a list that is displayed on the web app
    -As a user I want to be able to schedule appointments on a specified date
    -As a user I want to be able to message support if I ever run into any problems with the application
    -As a user I want to be able to navigate across all of the different pages of the application
    -As a user i want to register as a user with my email and password
    -As a user I want to be able to access information about patients and employees
    -As a user I want to be able to see appointments that were scheduled

## Technical Specification
 #### Tech 
    *Spring Boot
    *HTML
    *CSS
    *Javascript
    *Thymeleaf
    *JQuery
    *Java
    *JUnit
    *Mockito
    *Spring Boot Security/BCryptPasswordEncoder
    *MariaDB

#### Purpose:
    The purpose of this project was to create a full functioning full stack java application for the Per Scholas program fullfilling all the requirements given.
    
## User Functions:
   
   #### Login:
        -Login in with email and password
   
   #### Index Page:
        -Navigate between the different pages
        -Patients
        -Employee
        -Schedule Appointment
        -Contact Us
   
   #### Patients:
        -Add Patients
        -Update Patients
        -Delete Patients
        -Modal Form fields for inputting data
        
   #### Employee:
        -Add Employees
        -Update Employees
        -Delete Employees
        -Modal Form fields for inputting data
        
   #### Schedules:
         - Generic Table calendar was made to help patient plan out date
         -Form field to enter information and set date for appointments
         
   #### Contact Us:
        -Support for system users to ask questions and seek help
   
 ## Further Considerations:
    *Specifying functionality to user authorization
    *Create a mail system for the ContactUs page 
    *Establish relationships for data within the database for utilization
    *Create a sibiling patient app to round out the target groups for the application
    *Create and employee and patient live interactive page
 
 ## Challenges:
    The overall project was very challenging from start to finish. My first sticking point was with the implementation of modals within my html pages and tying them to get information from the database. At first the modals weren't working correctly and were displaying on the page and not hidden like it should have been. After researching what the issue was it turned out that bootstrap had changed the naming convention but never updated their site the match the new naming convention for modals as some of their examples were outdated. After that I got stuck getting the forms to submit the information to the database. The fix for this was setting names to the forms that matched the table column names so that my javascript scripts could read the information from the form and relay it to the database. My the last place I got stuck was writing unit tests for my controller classes within my application. I searched for a while before I could find and example of how to implement a test for the service class. Although I was puzzled at first after I had starting writing some of the test it slowly started to make sense to me. The overall project was tough but I feel I have learned a lot from this experience.
 
 ## References:
 
   https://developer.mozilla.org/en-US/docs/Web/JavaScript
   https://www.geeksforgeeks.org/html-tutorials/
   https://www.w3schools.com/css/default.asp
   https://www.pexels.com/
   https://fontawesome.com/
   https://getbootstrap.com/
    
