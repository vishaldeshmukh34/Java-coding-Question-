 package condition_else_if;

import java.util.Scanner;

class condition_else_if {

    public static void main(String[] arge){


        int marks;
        System.out.println("Enter The Marks:- ");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if(marks>=80 && marks<=100)
        {
            System.out.println("First Division");
        }
        else if(marks>60 && marks<80)
        {
            System.out.println("Second Division");
        }
       else if (marks>35 && marks<60)
       {
        System.out.println("Third Division");
       }
       else if(marks>0 && marks<35)
       {
        System.out.println("Failed...");
       }

    }
}