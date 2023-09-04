package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        //There maybe a chance that num2 can be 0;
        try {
            System.out.println(num1/num2);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        int d= scanner.nextInt();
        int res=d*d;
        System.out.println(res);

    }
}
