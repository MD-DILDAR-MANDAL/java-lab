import java.lang.*;

class patrn_14{
	public static void main(String[] args){
	for(int i = 8;i >0;i --){
		for(int l = 8 - i;l > 0;l--){
			System.out.print("  ");
			}
		for(int j = i,k = 1;j > 0;j--,k++){
			System.out.print(k + " ");
			}
		System.out.println();
		}
	}
}