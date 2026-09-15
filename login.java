import java.util.*;
public class login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username ");
        String username=sc.nextLine();
        System.out.println("enter pass ");
        String pass=sc.nextLine();
        int i;
        for(i=0; i<3; i++){
            if(username.equals("deep") && pass.equals("tiwari")){
            System.out.println("login successful");
            break;
        }
        else{
            System.out.println("invalid ");
            if(i==2){
                System.out.println("login failed");
            }
            else{
                System.out.println("try again");
                System.out.println("enter username ");
                username=sc.nextLine();
                System.out.println("enter pass ");
                pass=sc.nextLine();
            }
        }
    }



        
    }
    
}
