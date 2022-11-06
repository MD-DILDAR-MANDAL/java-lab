class patrn_18{
  public static void main(String args[]){
    int n = 8,temp = 2;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i-1;j++){
        System.out.print(" ");
      }
      for(inti;j <=(2*(n-i))+1;i++){
        if(j<=(n-(i-1))){
          System.out.print(j);
        }
        else System.out.print(i-temp);
        temp += 2;
      }
      temp =2;
      System.out.print("\n";)
   }
    
 }
}
