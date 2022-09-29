import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int n = 0;
        int arr [][];

        System.out.print("Enter matrix size: ");

        while (true) {
            try {
                n = Integer.parseInt(scanner.next());
                if(n < 0){
                    throw new NumberFormatException("Size lower than 0");
                }
                else{
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.print("Wrong format. Enter again: ");
            }
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
                while (true) {
                    try {
                        System.out.print("Enter matrix element [" + (i + 1) + "]" + "[" + (j + 1)  + "]"+": ");
                        arr[i][j] = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException exception) {
                        System.out.print("Wrong format. Enter again: ");
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++)
        {
             for (int j = 0; j < n; j++)
             {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i ++)
        {
            if (arr[i][n - i - 1] % 2 == 0 && arr[i][n - i - 1] > max)
            {
                max = arr[i][n - i - 1];
            }
        }
        if (max == Integer.MIN_VALUE)
        {
            System.out.println("No even element in sub diagonal");
        }
        else
        {
            System.out.println("Max even element in sub diagonal: " + max);
        }
    }
}
