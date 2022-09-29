import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args){
        int arr[][];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        if(k > n){
            System.out.println("Рядка k не існує");
            System.exit(0);
        }
        arr = new int[n][];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new int[n];
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = ThreadLocalRandom.current().nextInt(0, 101);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int temp = arr[k-1][k-1];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (i == k-1){
                    arr[i][j] -= temp;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
