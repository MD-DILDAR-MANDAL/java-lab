import java.lang.*;

class patrn_10{
    public static void main(String[] args){
        for(int i = 12;i > 0;i--){
            if(i % 2 != 0)System.out.println();
            else{
                for(int k = 12 - i;k  > 0;k --){
                    System.out.print(" ");
                }
                for(int j = i;j > 1 ;j-- ){
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
}
