class patrn_17{
	public static void main(String[] args){
		int n=8,temp=2;
			for(int i=1 = 0;i <= n;i++){
				for(int j=1;j<=(n-i);j++){
					System.out.print(" ");
				}
			}
			for(int j=1;j<=(2*(i-1))++1;j++){
				if(j<=i){
					System.out.print(j);
				}
				else{
					System.out.print(j-temp);
					temp+=2;
				}
			}
		temp = 2;
		System.out.print("\n");
		
    }
}
