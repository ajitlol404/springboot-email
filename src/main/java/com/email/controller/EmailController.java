package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private JavaMailSender mailSender;


    @GetMapping("/send/email")
    public void sendEmail() {
        System.out.println("Mail send started...");
        String from = "tarunmicromax12@gmail.com";
        String to = "ajitmicromax12@gmail.com";

        /*
         *
         * Sending plain text email
         *
         * */
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject("This is a plain text mail.");
        message.setText("Hello Guys! This is a plain text email.");
        mailSender.send(message);


        /*
         *
         * Sending html text email
         *
         * */
//        MimeMessage message = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//        try {
//            helper.setSubject("This is an HTML email");
//            helper.setFrom(from);
//            helper.setTo(to);
//            boolean html = true;
//            helper.setText("<b>Hey guys</b>,<br /><i>Welcome to this email.</i>", html);
//            mailSender.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }


        /*
         *
         * Sending email with attachment
         *
         * */
//        try {
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setSubject("Here's your e-book");
//            helper.setFrom(from);
//            helper.setTo(to);
//            helper.setText("<b>Dear friend</b>,<br><i>Please find the book attached.</i>", true);
//            FileSystemResource file = new FileSystemResource(new File("C:/Users/DELL/Downloads/mern-stack-pdf-9906.pdf"));
//            helper.addAttachment("FreelanceSuccess.pdf", file);
//            mailSender.send(message);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /*
         *
         * Sending email with inline images
         *
         * */
//        try {
//            MimeMessage message = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setSubject("Here's your pic");
//            helper.setFrom(from);
//            helper.setTo(to);
//            String content = "<b>Dear guru</b>,<br><i>Please look at this nice picture:.</i>"
//                    + "<br><img src='cid:image001'/><br><b>Best Regards</b>";
//            helper.setText(content, true);
//            FileSystemResource resource = new FileSystemResource(new File("C:\\Users\\DELL\\Downloads"));
//            helper.addInline("image001", resource);
//            mailSender.send(message);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        /*
         *
         * With dynamic data email sending
         * (Create JavaMailSenderImpl bean in main class)
         *
         * */
//        JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
//        mailSenderImpl.setHost("smtp.gmail.com");
//        mailSenderImpl.setPort(587);
//        mailSenderImpl.setUsername("tarunmicromax12@gmail.com");
//        mailSenderImpl.setPassword("dswfvtrgrfxkspqq");
//
//        Properties properties = new Properties();
//        properties.setProperty("mail.smtp.auth", "true");
//        properties.setProperty("mail.smtp.starttls.enable", "true");
//
//        mailSenderImpl.setJavaMailProperties(properties);
//
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setFrom(from);
//        message.setTo(to);
//        message.setSubject("This is a plain text email");
//        message.setText("Hello guys! This is a plain text email.");
//
//        mailSenderImpl.send(message);

        System.out.println("Mail sent...");
    }

}
