package pl.edu.uj.sender;

public class EmailRecipient extends Recipient {

  private final String recipientAddress;


  public EmailRecipient(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  public String getRecipientAddress() {
    return recipientAddress;
  }

  public void validateRecipient() throws Exception {

    char check = '@';
    int  il = 0;

    for(int i = 0; i < recipientAddress.length(); i++){
      if(recipientAddress.charAt(i) == check)
        il++;
    }

    if(il > 1){
      throw new Exception("RecipientAddress is wrong");
    }
  }


  @Override
  String anonymize() {
    String anonymizedRecipientAddress = "***@TODO";
    anonymizedRecipientAddress = anonymizedRecipientAddress.substring(anonymizedRecipientAddress.length()-5);
    return anonymizedRecipientAddress;
  }
}
