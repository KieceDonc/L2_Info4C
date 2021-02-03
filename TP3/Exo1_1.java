public class Exo1_1{

  public static void main(String[] args){
    int i = 5;
    int j = 5;
    for(int x=1;x<i;x++){
      for(int y=1;y<j;y++){
        System.out.print(pascal(x,y)+" ");
      }
      System.out.println("");
    }
  }

  public static int pascal(int i, int j){
    if(i==1 || j== 1){
      return 1;
    }else{
      int cij = pascal(i,j-1)+pascal(i-1,j);
      return cij;
    }
  }
}