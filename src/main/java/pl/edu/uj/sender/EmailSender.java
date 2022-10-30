package pl.edu.uj.sender;

import static java.lang.Thread.sleep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailSender implements Sender {

  private static final Logger logger = LoggerFactory.getLogger(EmailSender.class);

  @Override
  public void send(Message message, Recipient recipient)
          throws Exception {

      if(!(message instanceof EmailMessage)) throw new SenderException();
      if(!(recipient instanceof EmailRecipient)) throw new SenderException();



    // TODO wywolaj walidację odbiorcy

    String bodyMD5 = message.anonymizeMessageBody();
    String anonymizedRecipientAddress = recipient.anonymize();

    // TODO Dodaj wyjątek do sygnatury funkcji (Intelij sam podpowiada)
    //  Co trzeba zmienić w interfejsie?
    sleep(5000); // sending

    /* Use System.out to graphically distinguish sending from logging */
    System.out.printf("[Email] Message sent, title= '%s', bodyMD5= '%s', recipient= '%s'%n",
        message.getMessageTitle(), bodyMD5, anonymizedRecipientAddress);
  }
}
