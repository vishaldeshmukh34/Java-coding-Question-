package Condition_if;

import java.util.Scanner;

public class Condition_if {
    
    public static void main(String[] args) {
        int pwd;
        System.out.print("Enter Password:=");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if(pwd==7972){
            System.out.println("My Name : Vishal Deshmukh");
            System.out.println("My College : BBMJ");
            System.out.println("My Age : 21");
            System.out.println("My Contact : 90907363637");
            System.out.println("My Adress : Pune ");
        }
        else {
            System.out.println("Plese Enter Correct Possword ");
        }
    }
}
