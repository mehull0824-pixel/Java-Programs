import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char ch = sc.next().charAt(0);
        float f = sc.nextFloat();
        long l = sc.nextLong();
        double d = sc.nextDouble();
        short sh = sc.nextShort();
        boolean b = sc.nextBoolean();
        byte bt = sc.nextByte();

        
        System.out.println("Integer Value: " + n);
        System.out.println("String Value: " + s);
        System.out.println("Character Value: " + ch);
        System.out.println("Float Value: " + f);
        System.out.println("Long Value: " + l);
        System.out.println("Double Value: " + d);
        System.out.println("Short Value: " + sh);
        System.out.println("Boolean Value: " + b);
        System.out.println("Byte Value: " + bt);

    }
}
