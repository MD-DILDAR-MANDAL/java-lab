import java.lang.*;

class patrn_11{
    public static void main(String[] args){
        for(int i = 1;i <= 12;i ++){
            if(i % 2 == 0){
                System.out.println();
            }
            else{
                for(int k = (12-i-1)/2;k  >0;k --){
                    System.out.print("  ");
                }
                for(int j = i;j > 0 ;j-- ){
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
}
