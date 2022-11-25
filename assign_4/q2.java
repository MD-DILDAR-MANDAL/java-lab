import java.util.*;

class q2 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        String g=sc.nextLine();
        String n="";
        int ar[]=new int[(g.length())];
        int k=0;
        for(int i=0;i<g.length();i++){
            ar[k++]=g.charAt(i);
        }
        Arrays.sort(ar);
        for(int i=0;i<g.length();i++){
            char c=(char)ar[i];  
            n+=c;  
        }
        System.out.println(n);       
    }
}