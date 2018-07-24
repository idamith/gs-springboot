# Getting Started and Explore Spring Boot Features

Following is a question or take home assignment was given in a Software Engineer (Java) interview. This project is an attempt to solve that problem to demonstrate how to getting started a Spring Boot application while exploring its features.

# Question | Assignment

##Instruction:
-	All programs are to be written in Java programming language (Please state clearly the version that is used)
-	For any unclear information, please make assumptions) and state your reason(s)
-	Submit your solution with a clear instruction of how to download, configure, compile and run your programs

##Problem Set

### Part 1 - Simple form
Using Spring Boot (http://projects.spring.io/spring-boot/) create a Java web application project with an embedded web server (pick any) and embedded database (pick any). In addition to that, you could use any technology if necessary.

The goal is to store user information in the database. For now we only store firstname and lastname.

Create a web page that allows entering of new user data and stores the information in the database. The page should display an input field for firstname, an input field for lastname, and input field for email address, a text area field for biodata or simple introduction of the user, a dropdown or radio button for type of user (either Admin user or Normal user) and a save button.

If it is Admin user, add 2 additional input fields, a text area field for job responsibility description and a input field for admin access code in number.

If it is Normal user, add 1 additional input field, date of birth

On submit, the page should either clear the form, and display the message ‘User data saved’, or it should indicate an error if any of the input fields are empty.

###Part 2 - Search functionality
Create a page to search for a user. It should contain one input field and a ‘search’ button. On submitting the form, it should display a list of all users where either the firstname, lastname, biodata, job responsibility (if admin) or together contain the search word(s).
