import java.io.Console;
import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to Caesar Cipher!");
        System.out.println("Feel free to choose any of the following options:");
        System.out.println("1. Encrypt || 2. Decrypt || 3. Quit");
        String choice = myConsole.readLine();

    }
}
