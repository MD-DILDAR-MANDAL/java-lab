import java.lang.*;

class patrn_4{
    public static void main(String[] args){
        for(int i = 8;i > 0;i--){
            for(int k = i - 1;k > 0;k--)
            System.out.print("  ");
            for(int j = 8-i+1;j > 0 ;j-- ){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
