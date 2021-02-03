public class Exo3{

  public static void main(String[] args){
    C(5,3,"");
  }

  public static void C(int n, int k, String chaine){
    if(k==0){
      System.out.println(chaine);
    }else if(n>=k && k>0){
      C(n-1,k,chaine);
      C(n-1,k-1,n+chaine);
    }
  }
}