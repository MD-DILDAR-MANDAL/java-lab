import java.util.*;

class optional{
    String deFront(String s){
        String n="";
        if((s.length())>0 && s.charAt(0)=='a'){
            n+=s.charAt(0);
        }
        if((s.length())>1 && s.charAt(1)=='b'){
            n+=s.charAt(1);
        }
        for(int i=2;i<s.length();i++){
            n+=s.charAt(i);
        }
        return n;
    } 
}

class q4 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String g=sc.nextLine();
        optional ob=new optional();
        System.out.println(ob.deFront(g));        
    }
}