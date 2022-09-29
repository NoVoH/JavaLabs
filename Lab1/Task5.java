import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int firsto = 0;
        firsto = word.indexOf("о");
        System.out.println(firsto);
        if (word.indexOf("о", firsto) != -1)
        {
            String newstr= word.substring(0, firsto+1);
            String newstr2= word.substring(firsto+1, word.length()).replaceFirst("о", "");
            word = newstr+newstr2;
        }
        System.out.println(word);
    }
}
