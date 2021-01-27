public class Exo2C{

  public static void main(String[] args){
    gen_fibo(3,"");
  }

  public static void gen_fibo(int n, String str){
    if(n==0){
      System.out.println(str);
    }else if(n==1){
      gen_fibo(n-1,"0" + str);
      gen_fibo(n-1,"1" + str);
    }else{
      gen_fibo(n-1, "0" + str);
      gen_fibo(n-2, "01" + str);
    }
  }
}