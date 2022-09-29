import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        int arr[][];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new int[n][];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new int[n];
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] t1 = new int[n-1];
        int[] t2 = new int[n-1];
        int[] t3 = new int[n-1];
        int[] t4 = new int[n-1];
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            {
                t1[i-1]+=arr[i+j][j];
                t2[i-1]+=arr[j][i+j];
            }
        }
        for(int k=0; k<(n-1)*2; k++)
        {
            if(k < n-1){
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < n; j++)
                    {
                        if(i + j == k)
                        {
                            t3[k]+=abs(arr[i][j]);
                        }
                    }
                }
            }
            if(k > n-1){
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < n; j++)
                    {
                        if(i + j == k)
                        {
                            t4[k-(n-1)]+=abs(arr[i][j]);
                        }
                    }
                }
            }
        }
        int maximum = 0;
        int minimum = 10000000;
        for(int i = 0; i<n-2;i++)
        {
            maximum = max(maximum, t1[i]);
            maximum = max(maximum, t2[i]);
        }
        for(int i = 0; i<n-2;i++)
        {
            minimum = min(minimum, t3[i+1]);
            minimum = min(minimum, t4[i+1]);
        }
        System.out.println("Максимум серед сум елементів діагоналей, паралельних головній діагоналі: " + maximum);
        System.out.println("Мінімум серед сум елементів діагоналей, паралельних побічній діагоналі: " + minimum);
    }
}
