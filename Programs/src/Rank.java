import java.util.Arrays;

public class Rank {
    public static void main(String[] args) {
        Java5 s1 = new Java5(61, 89, 97, 99, 0);
        Java5 s2 = new Java5(62, 98, 97, 96, 0);
        Java5 s3 = new Java5(63, 99, 98, 95, 0);
        s1.totalCalc();
        System.out.println("Total mark of student 1 : " + s1.total);
        s2.totalCalc();
        System.out.println("Total Mark of student 2 : " + s2.total);
        s3.totalCalc();
        System.out.println("Total Mark of student 3 : " + s3.total);
        int[] marks = {s1.total, s2.total, s3.total};
        Arrays.sort(marks);
        if (marks[0] == s1.total) {

            System.out.println("Third Rank Holder");
            System.out.println("Regsiter no :" + s1.regNo);
            System.out.println("Total Mark : " + s1.total);
        } else if (marks[0] == s2.total) {
            System.out.println("Third Rank Holder");
            System.out.println("Regsiter no :" + s2.regNo);
            System.out.println("Total Mark : " + s2.total);
        } else {
            System.out.println("Third Rank Holder");
            System.out.println("Regsiter no :" + s3.regNo);
            System.out.println("Total Mark : " + s3.total);
        }
    }
}


/*

        if (s1.total > s2.total && s1.total > s3.total)
        {
            System.out.println("First Rank Holder");
            System.out.println("Register No : " + s1.regNo);
            System.out.println("Total Mark : " + s1.total);
            if(s2.total>s3.total) {
                System.out.println("Second Rank Holder ");
                System.out.println("Register no : " + s2.regNo);
                System.out.println("Total Mark : " + s2.total);
            }
            else if(s3.total>s2.total) {
                System.out.println("Second Rank Holder ");
                System.out.println("Register no : " + s3.regNo);
                System.out.println("Total Mark : " + s3.total);
            }
            else
            {
                System.out.println("Third Rank Holder ");
                System.out.println("Register no : " + s2.regNo);
                System.out.println("Total Mark : " + s2.total);

        } else if (s2.total > s1.total && s2.total > s3.total) {
            System.out.println("First Rank Holder");
            System.out.println("Register No : " + s2.regNo);
            System.out.println("Total Mark : " + s2.total);
        } else {
            System.out.println("First Rank Holder");
            System.out.println("Register No : " + s3.regNo);
            System.out.println("Total Mark : " + s3.total);
        }
    }
}

        */
/*if(s1.mark2>s2.mark2 && s1.mark2>s3.mark2){
        System.out.println("For Sub2 RegisterNo:"+s1.regNo+" is 1st rank");
        }
        else if(s2.mark2>s1.mark2 && s2.mark2>s3.mark2){
        System.out.println("For Sub2 RegisterNo:"+s2.regNo+" is 1st rank");
        }
        else{
        System.out.println("For Sub2 RegisterNo:"+s3.regNo+" is 1st rank");
        }
 if(s1.mark3>s2.mark3 && s1.mark3>s3.mark3){
         System.out.println("For Sub3 RegisterNo:"+s1.regNo+" is 1st rank");
         }
         else if(s2.mark3>s1.mark3 && s2.mark3>s3.mark3){
         System.out.println("For Sub3 RegisterNo:"+s2.regNo+" is 1st rank");
         }
         else{
         System.out.println("For Sub3 RegisterNo:"+s3.regNo+" is 1st rank");
         }
         }
         }

*//*

    }}*/
