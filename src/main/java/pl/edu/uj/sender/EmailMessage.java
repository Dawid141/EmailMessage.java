package pl.edu.uj.sender;

public abstract class EmailMessage extends Message {

  private final String messageTitle;
  private final String messageBody;

  public EmailMessage(String messageTitle, String messageBody) {
    this.messageTitle = messageTitle;
    this.messageBody = messageBody;
  }

  @Override
  public String getMessageTitle() {
    return messageTitle;
  }

  @Override
  public String getMessageBody() {
    return messageBody;
  }

  public void validateMessage() throws Exception {
    if(messageTitle.isBlank()) {
      throw new Exception("MessageTitle is empty");
    }
    if(messageBody.isBlank()) {
      throw new Exception("MessageBody is empty");
    }
  }

}
