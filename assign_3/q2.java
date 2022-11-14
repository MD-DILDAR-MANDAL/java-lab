class q2{
	public static void main(String args[]){
		System.out.println("Perfect number: ");
		for (int i=1; i<=1000; i++){
			int sum = 0,m=i/2;
			for (int j=1; j<=m; j++){
				if (i%j == 0)sum+=j;
			}
			if (sum ==i)System.out.print("\t" + i);
		}
	}
}

