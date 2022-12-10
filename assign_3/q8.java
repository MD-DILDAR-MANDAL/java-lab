import java.util.*;

class q8{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no. of elements in array: ");
		int n=scn.nextInt();
		int arr[];
		arr= new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<n;i++)	arr[i]=scn.nextInt();
		int min=arr[0];
		for (int i=0;i<n-1;i++){
			int temp = Math.abs(arr[i] - arr[i+1]);
			if(min>temp)min=temp;
		}
		int a=0,b=0;
		for (int i=0;i<n-1;i++){
			if(min == Math.abs(arr[i] - arr[i+1])){
				a= arr[i];
				b= arr[i + 1];
				break;
			}
		}
		System.out.println("minimum distance is : "+min+"  ( between "+a+" and "+b+" )");
	}
}
