public class ExoC {
  // an = 4an - 100;
  private static int[] an = new int[20];

  public static void main(String[] args){
    an[0]=100;
    for(int x=1;x<20;x++){
      an[x]=4*an[x-1]-100;
    }

    for(int x=0;x<20;x++){
      System.out.println("a"+x+" = "+an[x]);
    }
  }
}
