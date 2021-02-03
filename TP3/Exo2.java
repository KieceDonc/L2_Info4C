public class Exo2{

  public static void main(String[] args){
    Comp(3,3,"");
  }

  public static void Comp(int n, int k,String str){
    if(k==0){
      System.out.println(str);
    }else if(k==1){
      Comp(n,k-1,String.valueOf(n)+str);
    }else{
      for(int x=n;x>=0;x--){
        Comp(x,k-1,String.valueOf(n-x)+str);
      }
    }
  }
}