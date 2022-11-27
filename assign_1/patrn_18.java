class patrn_18{
	public static void main(String args[]){
		for(int i=8;i>=1;i--){
		
      			for(int j=8-i;j>=0;j--){
        			System.out.print(" ");
      			}
      			int temp = 2;
      			for(int j =1;j <=2*i-1;j++){
        			if(j<=i){
          				System.out.print(j);
        			}	
        			else{
        			 	System.out.print(j-temp);
        				temp += 2;
      				}
   			}
   			System.out.print("\n");
 		}
	}
}
