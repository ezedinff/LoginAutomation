import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        LoginToPortal loginToPortal =  new LoginToPortal();
        Scanner scanner =  new Scanner(System.in);
        String username =  scanner.next("Enter your username: ");
        String password =  scanner.next("Enter your password: ");
        loginToPortal.login(username, password);
    }
}
