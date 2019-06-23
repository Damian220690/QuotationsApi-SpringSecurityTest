# QuotationsApi-SpringSecurityTest
Simple App which uses Spring Security

This application shows sample permission management.
Any user can enter to the url adress: localhost:8080/api and look all quotations which were added to the application.
Moderator can add some quotation to the application. If you want log in as a moderator, please enter this data:

username: moderator
password: moderator

To add the quotation enter the following url localhost:8080/api/{authorName}/{quotation content}.

As an admin, you can perform the previously specified activities and additionally delete quotation by index. If you want to log in as an admin, please enter this data:

username: admin
password: admin

To delete the quotation enter the following url localhost:8080/api/{index}.

Technologies:
-Spring Boot,
-Spring Security
