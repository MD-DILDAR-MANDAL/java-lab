import java.lang.*;

class patrn_15{
	public static void main(String[] args){
	for(int i = 8;i >0;i --){
		for(int l = i - 1;l > 0;l--){
			System.out.print("  ");
			}
		for(int j = 8 - i + 1;j > 0;j--){
			System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}