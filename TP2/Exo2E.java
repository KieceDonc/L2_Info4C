public class Exo2E{

  public static void main(String[] args){
  }

  public static void gen_dyck(int n, int k, String str){
    if(n==0){
      System.out.println(str);
    }else if(k==0 && n>=1){
      gen_dyck(n-1, k-1, "0" + str);
    }else if(n==2*k && n>=1){
      gen_dyck(n-1, k-1, "1" + str);
    }else if(n>k && k>=1){
      gen_dyck(n-1, k, "0" + str);
      gen_dyck(n-1, k-1, "1" + str);
    }
  }
}