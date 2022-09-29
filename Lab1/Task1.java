import java.util.Scanner;
import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a + b > c && b + c > a && a + c > b){
            System.out.println("Можуть бути сторонами трикутника");
            if(a == b && a == c){
                System.out.println("Трикутник рівносторонній");
            }
            else if (2 * pow(max(max(a, b), c), 2) == pow(a, 2) + pow(b, 2) + pow(c, 2)){
                System.out.println("Трикутник прямокутний");
            }
            else if (2 * pow(max(max(a, b), c), 2) > pow(a, 2) + pow(b, 2) + pow(c, 2)){
                System.out.println("Трикутник тупокутний");
            }
            else if (2 * pow(max(max(a, b), c), 2) < pow(a, 2) + pow(b, 2) + pow(c, 2)) {
                System.out.println("Трикутник гострокутний");
            }
            if ((a == b || a == c || b == c) && ((a == b && a == c)!= true)){
                System.out.println("Трикутник рівнобедрений");
            }
        }
        else{
            System.out.println("Не можуть бути сторонами трикутника");
        }
    }
}
