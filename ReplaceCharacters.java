import java.util.*;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = str.replace('d', 'f');

        System.out.println(result);
    }
}