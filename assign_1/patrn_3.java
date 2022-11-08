import java.lang.*;

class patrn_3{
    public static void main(String[] args){
        for(int i = 8;i > 0;i--){
            for(int k = 8 - i;k > 0;k--){
                System.out.print("  ");
            }
            for(int j = i;j > 0 ;j-- ){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
