import java.util.*;

class optional{
    String deFront(String s){
        String n="";
        if(s.charAt(0)=='a'){
            n+=s.charAt(0);
        }
        if(s.length()>1 && s.charAt(1)=='b'){
            n+=s.charAt(1);
        }
        int l = s.length();
        n+=s.substring(2,l);
        return n;
    }
}

class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String g=sc.nextLine();
        optional ob=new optional();
        System.out.println(ob.deFront(g));        
    }
}
