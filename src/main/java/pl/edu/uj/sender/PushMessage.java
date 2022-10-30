package pl.edu.uj.sender;

public class PushMessage extends Message {
  private final String messageTitle;
  private final String messageBody;

  public PushMessage(String messageTitle, String messageBody) {
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

  void validateMessage() throws Exception {
    if(messageTitle.isBlank()) {
      throw new Exception("MessageTitle is empty");
    }
    if(messageBody.isBlank()) {
      throw new Exception("MessageBody is empty");
    }
  }

}
