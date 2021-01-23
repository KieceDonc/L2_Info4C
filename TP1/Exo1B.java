public class Exo1B {

  private static int[] cn = new int[100];
  public static void main(String[] args){
    cn[0] = 0;
    cn[1] = 1;
    for(int x=2;x<100;x++){
      cn[x] = cn[x-1]-cn[x-2];
    }

    for(int x=0;x<100;x++){
      System.out.println("c"+x+" = "+cn[x]);
    }
    // cn = 0 si n= 0 mod 3, 1 si n=1 mod 6 ou 1 mod 6, -1 si n=4 mod 6 ou 5 mod 6,
    // ( pas sur ) Forme close (sqrt(3)/3)*((1+i*sqrt(3))/3)+(sqrt(3)/3)*((1-i*sqrt(3))/3)
  }

  public int cn(int n){
    if(n==0){
      return 0;
    }else if(n==1){
      return 1;
    }else{
      return cn(n-1)-cn(n-2);
    }
  }
}
