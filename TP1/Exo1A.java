package TP1_2;

class Exo1A{

  private static int[] an = new int[20];
  public static void main(String[] args){
    an[0] = 0;
    an[1] = 1;
    for(int x=2;x<20;x++){
      an[x] = 5*an[x-1]-6*an[x-2];
    }

    for(int x=0;x<20;x++){
      System.out.println("a"+x+" = "+an[x]);
    }

    for(int x=0;x<20;x++){
      System.out.println("Forme close a"+x+" = "+(Math.pow(3,x)-Math.pow(2,x)));
    }
  }
}