import java.util.Scanner;
class q1{ 
	public static void main(String[] args){
	System.out.print("enter number between 1 to 50 ");
	Scanner obj = new Scanner(System.in);
	int n = obj.nextInt();
	int ans = 0;
	for(int i =1;i <= n;i++){
		ans += i;
		System.out.print(i+" ");
		if(ans == n)break;
	}
	System.out.print("  "+ans);
}

}
