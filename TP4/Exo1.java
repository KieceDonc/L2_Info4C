public class Exo1{

  public static void main(String[] args){
    for(int x=1;x<11;x++){
      for(int y=1;y<11;y++){
        if(x>y){
          System.out.println("n="+x+", y="+y+", sterling="+Sterling(x,y));
        }
      }
    }
  }

  public static int Sterling(int n, int k){
    if(k==1 || n==k){
      return 1;
    }else{
      return Sterling(n-1,k-1)+k*Sterling(n-1,k);
    }
  }
}