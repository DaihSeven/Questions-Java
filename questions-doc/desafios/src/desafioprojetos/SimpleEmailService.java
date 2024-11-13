package desafioprojetos;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SimpleEmailService implements EmailService {
    private String emailAddress;

    public SimpleEmailService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendEmail(String message) {
        String to = this.emailAddress;
        String from = "your-email@example.com";
        String host = "smtp.gmail.com";

        // Configura as propriedades do servidor de email
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // necessário para alguns servidores que exigem TLS

        // Obtém o objeto de sessão com autenticação
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password");
            }
        });

        try {
            // Cria um objeto MimeMessage padrão
            MimeMessage mimeMessage = new MimeMessage(session);

            // Define o remetente
            mimeMessage.setFrom(new InternetAddress(from));

            // Define o destinatário
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Define o assunto
            mimeMessage.setSubject("Atualização de despesas");

            // Agora defina a mensagem real
            mimeMessage.setText(message);

            // Envia a mensagem
            Transport.send(mimeMessage);
            System.out.println("E-mail enviado com sucesso...");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
