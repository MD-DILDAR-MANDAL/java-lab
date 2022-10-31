import java.lang.*;

class patrn_13{
	public static void main(String[] args){
	for(int i = 8;i >0;i --){
		for(int j = 8 - i + 1,k = 1;j > 0;j--,k++){
			System.out.print(k + " ");
			}
		System.out.println();
		}
	}
}