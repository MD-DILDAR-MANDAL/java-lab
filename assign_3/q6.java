import java.util.*;

class q6{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int arr[];
		System.out.println("enter no. of elements you want to enter");
		int n = sc.nextInt();
		arr = new int[n];
		int cnt =0;
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]!=0)cnt++;
		}
		System.out.println("Total no of non zero elements in the array: "+cnt);
	}

}
