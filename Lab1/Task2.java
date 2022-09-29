import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        String temp;
        double[] arr = new double[n];
        for(int i = 0; i < n ; i++)
        {
            arr[i] = ThreadLocalRandom.current().nextDouble(0, 101);
            temp = String.valueOf(arr[i]);
            if (Integer.parseInt(temp.substring(temp.length()-1)) == k)
            {
                count++;
            }
            System.out.println(arr[i]);
        }
        System.out.println(count);
        double[] res = new double[count];
        int j = 0;
        for(int i = 0; i < n; i++)
        {
            temp = String.valueOf(arr[i]);
            if (Integer.parseInt(temp.substring(temp.length()-1)) == k)
            {
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println();
        for(int i = 0; i < count; i++)
        {
            System.out.println(res[i]);
        }
    }
}
