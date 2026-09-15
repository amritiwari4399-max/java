import java.util.*;
public class prime {
    public static void main(string[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num ");
        int a=sc.nextInt();
        int i;
        for(i=2; i<=a; i++){
            boolean isPrime = true;
            for(j=2; j<=math.sqrt(i);j++)
                {
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime num "+a );
                System.out.println(isPrime);
            }
            
        }
    }
    
}
