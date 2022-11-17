import java.util.*;

class q5{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int size ,arr[],cntArrElm[];
		System.out.println("enter size of array and input elements");	
		size = sc.nextInt();
		arr = new int[size];
		cntArrElm = new int[10];
		
		for(int i =0;i<10;i++) cntArrElm[i]=0;
	
		for(int i = 0;i<size;i++){
			arr[i] = sc.nextInt();
		}	
		for(int i = 0;i<size;i++) cntArrElm[arr[i]]++;
		int len = arr.length;
		int sizeC= size;
		for(int i=size-1;i>=0;i--){
			if(cntArrElm[arr[i]]>1){
				if(i!=size-1){
					arr[i]=0;
					for(int j = i;j<size-1;j++){
						arr[j]=arr[j+1];
					}
				}
				cntArrElm[arr[i]] --;
				sizeC--;
		System.out.println(Arrays.toString(arr).substring(0,sizeC));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
