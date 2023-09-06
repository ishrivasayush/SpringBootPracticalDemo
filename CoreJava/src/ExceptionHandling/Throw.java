package ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num2==0)
        {
            throw new ArithmeticException("Can not divide by Zero");
        }
        System.out.println(num1/num2);
    }
    /*
    Throw
    if we want to throw the exception explicatly than we use the throw keyword.

    if we want to set the coustom message
    if the exception is not the part of the universal exception

     */
    }
