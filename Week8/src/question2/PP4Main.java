package question2;
//Main

public class PP4Main {
    public static void main(String[] args) {
        Secret secret = new Secret("Helloworld");
        Passwd password = new Passwd("Password");

        //Secret
        secret.encrypt();
        System.out.println("Encrypted Secret   : " + secret.getEncryptedText());
        System.out.println("Decrypted Secret   : " + secret.decrypt());

        //Password
        password.encrypt();
        System.out.println("Encrypted Password : " + password.getEncryptedText());
        System.out.println("Decrypted Password : " + password.decrypt());
    }
}
