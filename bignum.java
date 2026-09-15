import java.util.*;
public class bignum{
    public static void main(String[] args)
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("enter first num ");
        double a=ab.nextDouble();
        System.out.println("enter second num ");
        double b=ab.nextDouble();
        System.out.println("enter third num");
        double c=ab.nextDouble();
        double highest=a;
        if(b>highest){

            highest = b;
        }
        if(c>highest){
            highest =c;
        }
        System.out.println("highest num is "+highest);


    }
}
    

