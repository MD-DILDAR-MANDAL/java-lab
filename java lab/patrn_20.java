class patrn_20{
  public static void main(String[] args){
    int n = 8;
    for(int i = 8;i > 0;i--){
      for(int j =1;j <= i;j++){
        System.out.print(j);
      }
     
     for(int j = 1;j<=(n-i);j++){
      System.out.print(" ");
     }
      
      for(int  j= 1;j <=((n-1)-i);j++){
        System.out.print(" ");
      }
      for(int j = 1;j <= i;j++){
        if(j < n){
          if(i <=n)System.out.print(i-j);
          else System.out.print((i+1)-j);
        }
      }
      System.out.print("\n");
    }
  }
}
