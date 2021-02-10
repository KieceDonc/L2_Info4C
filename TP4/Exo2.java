public class Exo2{

  public static void main(String[] args){
    for(int x=0;x<10;x++){
      System.out.println(expo(x,x));
    }
  }

  public static int expo(int x, int n){
    if(n==0){
      return 1;
    }else if(n%2==0){
      int value = expo(x,n/2);
      return value*value;
    }else{
      int value = expo(x,(n-1)/2);
      return x*value*value;
    }
  }
}