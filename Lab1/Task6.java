import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        boolean res = password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        if (res == true)
        {
            System.out.println("Пароль надійний");
        }
        else
        {
                System.out.println("Пароль ненадійний");
        }
    }
}
