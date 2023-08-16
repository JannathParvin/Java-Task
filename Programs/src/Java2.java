import java.util.Scanner;
import java.io.*;

public class Java2 {
    public static void main(String[] args) throws FileNotFoundException {
        /*File f1=new File("C:\\Users\\Programs");
        Scanner in = new Scanner(f1);
        while(in.hasNextLine())
        {
            String data=in.nextLine();
            System.out.println(data);
        }*/
        //Scanner in = new Scanner(System.in);
       /* File f1 = new File("C:\\Users\\Programs");
       // BufferedReader br =new BufferedReader()
        Scanner sc = new Scanner(f1);
        int lineNumber = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
    }
}*/
        Scanner in = new Scanner(System.in);

        String str1 = " ";
        String str2=" ";
        System.out.println("Enter the String");
        String str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))) {
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.println("The Numbers are : " +str1);
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
            {
                str2=str2+str.charAt(i);
            }
        }
        System.out.println("Special Characters are : "+ str2);


    }
}
