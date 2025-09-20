public class program8_ {
    public static void main(String[] args) {
        // WAP to accept a year check whether it is Leap Year or not.

        int year = 2005 ;
        if(year % 400 == 0 )
        {
            System.out.println("leap year");
        }
        else if (year % 100 == 0)
        {
            System.out.println("not leap year");
        }
        else if(year % 4 == 0)
        {
            System.out.println("leap year");
        }
        else 
        {
            System.out.println("not leap year");
        }


    }
}

// Start

// Accept the year from the user

// Check conditions:

// If year % 400 == 0 → leap year

// Else if year % 100 == 0 → not leap year

// Else if year % 4 == 0 → leap year

// Else → not leap year

// Print the result

// End