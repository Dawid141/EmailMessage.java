package pl.edu.uj.sender;

import java.util.regex.Pattern;

public class PushRecipient extends Recipient {
  private final String recipientAddress;

  public PushRecipient(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  @Override
  public String getRecipientAddress() {
    return recipientAddress;
  }

  void validateRecipient() throws SenderException {
    Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
    if( !Pattern.matches(String.valueOf(p), recipientAddress))
      throw new SenderException();

  }


  @Override
  String anonymize() {
    // Uzupełnij kod do anonimizacji:
    String anonymizedRecipientAddress = "...ABC";
    anonymizedRecipientAddress = anonymizedRecipientAddress.substring(anonymizedRecipientAddress.length()-5);
    return anonymizedRecipientAddress;
  }
}
