public class Exo2A {

  private static String[] an = new String[20];

  public static void main(String[] args){
    /*for(int x=0;x<20;x++){
      int puissance = (int) Math.ceil(Math.sqrt(x));
      an[x]="";
      do{
        int calcul = x-(int) Math.pow(2,puissance);
        System.out.println(calcul);
        if(calcul>=0){
          an[x]+="1";
        }else{
          an[x]+="0";
        }
        puissance--;
      }while(puissance>=0);
      System.out.println("a"+x+" = "+an[x]);
    }*/
    gen_bin(5,"");
  }

  public static void gen_bin(int n,String chaine){
    if(n ==0){
      System.out.println(chaine);
    }else{
      gen_bin(n-1, "0" + chaine);
      gen_bin(n-1, "1" + chaine);
    }
  }
}
