package question2;

//Password

public class Passwd implements Encryptable {
    protected String password;
    protected String encryptedPassword;

    public Passwd(String password) {
        this.password = password;
        this.encryptedPassword = "";
    }

    @Override
    public void encrypt() {
        encryptedPassword = new StringBuilder(password).reverse().toString();  // reverse string
    }

    public String decrypt() {
        return new StringBuilder(encryptedPassword).reverse().toString();  //reverse again to decrypt
    }

    @Override
    public String getEncryptedText() {
        return encryptedPassword;
    }
}
