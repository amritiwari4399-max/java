public class reversestringstack {
    public static void main(String[] args) {
        String str="Hello World";
        stacklist s=new stacklist();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String rev="";
        while(s.head!=null){
            rev+=(char)s.pop();
        }
        System.out.println(rev);
    }
    
    
}
