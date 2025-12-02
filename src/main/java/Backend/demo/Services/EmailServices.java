package Backend.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendMail(String name, String email, String message) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("anoopyadav5984@gmail.com");
        msg.setSubject("New Message from " + name);
        msg.setText("Name: " + name + "\nEmail: " + email + "\nMessage:\n" + message);
        msg.setReplyTo(email);
        mailSender.send(msg);
        return true;
    }
}

