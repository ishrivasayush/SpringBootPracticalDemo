package ExceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        String s1;                            //Blank variable is used so here compile time error we get;
        String s2=null;
        //System.out.println("Result: "+s1.length());    //Blank variable is used so here compile time error we get compile time error;

         System.out.println("Result: "+s2.length());     //Runtime Error
    }
}
/*
Exception are  any abnormal unwanted, extraordinary and unexpected events that may occur at runtime.'

 */