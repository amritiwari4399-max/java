import java.util.Scanner;
public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        stacklist s=new stacklist();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String rev="";
        while(s.head!=null){
            rev+=(char)s.pop();
        }
        System.out.println("Reversed string: "+rev);
    }

}
