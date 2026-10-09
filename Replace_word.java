import java.util.Scanner;
public class Replace_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();

        str = str.replace(oldWord , newWord);
        System.out.println(str);

    }
}
