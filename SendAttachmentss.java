
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
class SendAttachmentss
{ 
 public SendAttachmentss(String emailA,String path)
 {
     String to=emailA;//change accordingly
  final String user="queenkingmca@gmail.com";//change accordingly
  final String password;
     password = "queenkingmca1@";
  Properties properties = System.getProperties();
  properties.setProperty("mail.smtp.host", "smtp.gmail.com");//change accordingly
   properties.put("mail.smtp.port", "587");//this is the port to smtp server
  properties.put("mail.smtp.auth", "true");
  properties.put("mail.smtp.starttls.enable", "true");
  
  Session session = Session.getInstance(properties,
   new Authenticator() {
       
   protected PasswordAuthentication getPasswordAuthentication() {
   return new PasswordAuthentication(user,password);
   }
  });
  
  try{
    MimeMessage message = new MimeMessage(session);
    message.setFrom(new InternetAddress(user));
    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
    message.setSubject("Message Aleart");  
    BodyPart messageBodyPart1 = new MimeBodyPart();
    messageBodyPart1.setText("This is message body");   
    MimeBodyPart messageBodyPart2 = new MimeBodyPart();

    String filename = path;//change accordingly
    DataSource source = new FileDataSource(filename);
    messageBodyPart2.setDataHandler(new DataHandler(source));
    messageBodyPart2.setFileName(filename);
   
   
    //5) create Multipart object and add MimeBodyPart objects to this object    
    Multipart multipart = new MimeMultipart();
    multipart.addBodyPart(messageBodyPart1);
    multipart.addBodyPart(messageBodyPart2);

    //6) set the multiplart object to the message object
    message.setContent(multipart );
   
    //7) send message
    Transport.send(message);
 
   System.out.println("message sent....");
   }catch (MessagingException ex) {ex.printStackTrace();}
 }

    private static class javax {

        public javax() {
        }
 }
    public static void main(String [] args){
     
 }
}

