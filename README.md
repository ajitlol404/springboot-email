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


Note: -
To use without application.properties comment the code bean in main class and properties in application.properties.

If mail is not get sended then use jakarta.activation-api dependencies
<dependency>
    <groupId>jakarta.activation</groupId>
    <artifactId>jakarta.activation-api</artifactId>
    <version>2.1.0</version>
</dependency>


