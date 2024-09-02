import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner calculation = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1= calculation.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2= calculation.nextInt();


        System.out.println( num1 +"+" +num2 +"=" +(num1+num2));
        System.out.println( num1 +"-" +num2 +"=" +(num1-num2));
        System.out.println( num1 +"*" +num2 +"=" +(num1*num2));
        System.out.println( num1 +"/" +num2 +"=" +(num1/num2));
        System.out.println( num1 +"%" +num2 +"=" +(num1%num2));



    }
}