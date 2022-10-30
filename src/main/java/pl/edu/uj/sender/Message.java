package pl.edu.uj.sender;

public abstract class Message {

    abstract String getMessageTitle();

    abstract String getMessageBody();

    abstract void validateMessage() throws Exception;

    String anonymizeMessageBody() {

        // TODO uzupełnij kod do anonimizacji:

        return "abcd... (MD5)";
    }
}
