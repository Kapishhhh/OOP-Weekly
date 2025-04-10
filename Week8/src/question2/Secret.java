package question2;

//secret

public class Secret implements Encryptable {
    protected String text;
    protected String encryptedText;

    public Secret(String text) {
        this.text = text;
        this.encryptedText = "";
    }

    @Override
    public void encrypt() {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append((char) (c + 3)); 
        }
        encryptedText = sb.toString();
    }

    public String decrypt() {
        StringBuilder sb = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            sb.append((char) (c - 3));  
        }
        return sb.toString();
    }

    @Override
    public String getEncryptedText() {
        return encryptedText;
    }
}
