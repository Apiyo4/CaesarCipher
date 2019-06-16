import java.io.Console;
import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        System.out.println("Welcome to Caesar Cipher!");
        while(programRunning){
            Console myConsole = System.console();
            System.out.println("Choose any of the following options to continue:");
            System.out.println("1. Encrypt || 2. Decrypt || 3. Quit");
            String choice = myConsole.readLine();
            if( (choice.equals("1")) || (choice.equalsIgnoreCase("Encrypt"))){
                System.out.println("Enter a word to encrypt");
                String strName = myConsole.readLine();
                System.out.println("Enter a key to shift the letters");
                int intKey = Integer.parseInt(myConsole.readLine());
                Encrypt encrypt = new Encrypt(intKey, strName);
                String results = encrypt.isEncrypt();
                System.out.println(String.format("Your string is %s.", results));
                System.out.println("-----------------------------------------------------------------");
            } else if((choice.equals("2")) || (choice.equalsIgnoreCase("Decrypt"))){
                System.out.println("Enter a word to decrypt");
                String strName = myConsole.readLine();
                System.out.println("Enter a key to shift the letters");
                int intKey = Integer.parseInt(myConsole.readLine());
                Decrypt decrypt = new Decrypt(intKey, strName);
                String results = decrypt.isDecrypt();
                System.out.println(String.format("Your string is %s.", results));
                System.out.println("-----------------------------------------------------------------");
            }
        }

    }
}
