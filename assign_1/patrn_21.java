class patrn_21{
	public static void main(String args[]){
		int n =8,temp =1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*(i-1)+1);j++){
				if(j<=i){
					if(temp>9){
					temp=0;
					}
				System.out.print(temp);
				temp+=1;
				}
				else{
					if(j==(i+1)){
						temp-=2;
					}
					else temp-=1;
					if(temp < 0){
						temp =9;
					}
					System.out.print(temp);
				}	
			}
			if(i>=2) {
				temp+=1;
			}
			System.out.print("\n");
		}
	}
}
