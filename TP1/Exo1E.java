public class ExoE {
  private static int[] fn = new int[20];

  public static void main(String[] args){
    fn[0]=0;
    fn[1]=1;
    for(int x=2;x<20;x++){
      fn[x]=fn[x-1]+fn[x-2];
    }

    for(int x=0;x<20;x++){
      System.out.println("f"+x+" = "+fn[x]);
    }

    for(int x=0;x<20;x++){
      System.out.println("Forme close, test 0, f"+x+" = "+((Math.pow(((1+5)/2),x)-Math.pow(((1-5)/2),x))/Math.sqrt(5)));
    }

    for(int x=0;x<20;x++){
      System.out.println("Forme close, test 1, f"+x+" = "+((Math.round(0.4472135954*Math.pow(1.618033988,x)))));  
    }
  }
}
