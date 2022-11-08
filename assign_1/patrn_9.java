import java.lang.*;
class patrn_9 {
    public static void main(String args[]){
        for(int i = 0;i < 7;i++){
            if(i == 0 || i == 6){
                for(int j = 0; j < 7; j++){
                    System.out.print("# ");
                }
            }
            else{
                for(int k = 0; k < 7 ;k ++){
                    if((k == i) || (k == 6-i) || k == 0 || k == 6) System.out.print("# ");
                    else System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
}
