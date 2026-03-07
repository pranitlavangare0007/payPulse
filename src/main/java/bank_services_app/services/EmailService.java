package bank_services_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendOtpEmail(String to, String otp){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(to);
        message.setSubject("PayPulse Email Verification");
        message.setText(
                "Welcome to PayPulse Bank\n\n" +
                        "Your verification OTP is: " + otp +
                        "\nValid for 5 minutes."
        );

        mailSender.send(message);
    }
}
