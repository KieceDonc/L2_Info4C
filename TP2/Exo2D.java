public class Exo2D{

  public static void main(String[] args){
    gen_comb(4,2,"");
  }

  public static void gen_comb(int n, int k, String str){
    if(n==0){
      System.out.println(str);
    }else if(k==0 && n!=0){
      gen_comb(n-1, k, "0" + str);
    }else if(k==n && n!=0){
      gen_comb(n-1, k-1, "1" + str);
    }else{
      gen_comb(n-1, k, "0" + str);
      gen_comb(n-1, k-1, "1" + str);
    }
  }
}