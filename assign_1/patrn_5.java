import java.lang.*;
class patrn_5{
    public static void main(String[] args){
        for(int i = 0;i < 7;i++){
            if(i == 0 || i == 6){
                for(int j = 0; j < 7; j++){
                    System.out.print("# ");
                }
            }
            else{
                System.out.print("#           #");
            }
            System.out.println();
        }
    }
}
