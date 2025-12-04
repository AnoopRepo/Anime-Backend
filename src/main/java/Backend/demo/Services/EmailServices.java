package Backend.demo.Services;

import Backend.demo.Entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendReply(String email, String message) {
        if(message!=null && !message.isEmpty()){
            SimpleMailMessage msg = new SimpleMailMessage();
            String name="Anoop Yadav";
            String mesage="Thanku you for responsing";
            msg.setTo(email);
            msg.setSubject("New Message from " + name);
            msg.setText("Name: " + name + "\nMessage:\n" + mesage);

            mailSender.send(msg);
            return true;
        }
        return false;
    }

    public boolean emailToAdmin(String name,String email,String message) {
        SimpleMailMessage msg = new SimpleMailMessage();
        String emails="londamaka.fake@gmail.com";
        msg.setTo(emails);
        msg.setSubject("New Message from " + name);
        msg.setText("Name: " + name + "\nEmail: " + email + "\nMessage:\n" + message);
        msg.setReplyTo(email);
        mailSender.send(msg);
        return true;
    }
}

