package pl.edu.uj.sender;

public abstract class Recipient {
    abstract String getRecipientAddress();

    abstract void validateRecipient() throws Exception;

    abstract String anonymize();
}
