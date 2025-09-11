package operators;

public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        a += 5;  // a = a + 5;
        a -= 5;  // a = a - 5;
        a *= 5;  // a = a * 5;
        a /= 5;  //a = a / 5;
        a %= 5; // a = a % 5;

        System.out.println(a);

    }   
}
// assignment operators are used to assign values to variables and can also be used to perform arithmetic operations and update the variable's value in a concise manner.
//the basic assignment operator is =, and there are compound assignment operators like +=, -=, *=, /=, and %= that combine arithmetic operations with assignment.