public class Exo3{

  public static void main(String[] args){
    pascal(5,3,"");
  }

  public static void pascal(int n, int k, String chaine){
    if(k==0){
      System.out.println(chaine);
    }else if(n>=k && k>0){
      pascal(n-1,k,n+chaine);
      pascal(n-1,k-1,String.valueOf(n-1)+chaine);
    }
  }
}