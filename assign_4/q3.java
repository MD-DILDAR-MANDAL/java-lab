import java.util.*;

class opt{
    int countYZ(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i-1)=='y' || s.charAt(i-1)=='z') count++;
            }
        }
        if(s.charAt((s.length()-1))=='y' || s.charAt((s.length()-1))=='z') count++;
        return count;
    }
}

class q3 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String g=sc.nextLine();
        opt ob=new opt();
        System.out.println(ob.countYZ(g));       
    }
}