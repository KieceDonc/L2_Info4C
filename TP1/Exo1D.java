public class ExoD {
  // an = 1.05*an + 500;
  private static double[] en = new double[20];

  public static void main(String[] args){
    en[0]=1000;
    for(int x=1;x<20;x++){
      en[x]=1.05*en[x-1]+500;
    }

    for(int x=0;x<20;x++){
      System.out.println("e"+x+" = "+en[x]);
    }
  }
}
