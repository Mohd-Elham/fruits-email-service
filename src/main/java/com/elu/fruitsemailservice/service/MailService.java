package com.elu.fruitsemailservice.service;


import com.elu.fruitsemailservice.dto.FruitsDto;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    /**
     * this dependency from the mailsender.
     */
    private JavaMailSender mailSender;

    /**
     * @param mailSenderParam
     */
    public MailService(final JavaMailSender mailSenderParam) {
        this.mailSender = mailSenderParam;

    }

    /**
     * @param fruitsDtoParam
     */
    public void sendMail(final FruitsDto fruitsDtoParam) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,
                    true, "UTF-8");

            String messageBody = String.format(
                    "Hi %s,%n%nYour order for '%s' has been confirmed!"
                            + "%nThank you for shopping with us."
                            + "%n%nBest Regards,%nFruty fruty",
                    fruitsDtoParam.getUserName(), fruitsDtoParam.getName()
            );

            helper.setTo(fruitsDtoParam.getEmail());
            helper.setSubject("Order confirmation Your fruit is on the way ");
            helper.setText(messageBody, false);

            mailSender.send(mimeMessage);
            System.out.println("Mail Sent to mail "
                    + fruitsDtoParam.getEmail());

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}
