import java.util.Scanner;
public class Java4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=in.nextLine();
        System.out.println("Enter the second String");
        String s2=in.nextLine();
        System.out.println("Concatinated String");
        System.out.println(s1 +" "+ s2 );
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.endsWith("s"));
        System.out.println(s2.charAt(3));
    }
}

