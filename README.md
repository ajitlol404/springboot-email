# springboot-email

With application.properties
------------------------------
Set details:-
spring.mail.host=*****
spring.mail.port=***
spring.mail.username=your_email
spring.mail.password=uyour_password
spring.mail.properties.mail.smtp.auth=true/false
spring.mail.properties.mail.smtp.starttls.enable=true/false


Without application.properties
------------------------------
Create JavaMailSenderImpl bean in main class,
Set properties with Properties class and JavaMailSenderImpl.


