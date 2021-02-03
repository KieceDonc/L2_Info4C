public class Exo1_2{

  public static void main(String[] args){
    int i = 5;
    int j = 5;

    int[][] tab = new int[i][j];
    for(int x=0;x<i;x++){
      for(int y=0;y<j;y++){
        if(y==0){
          tab[x][0]=1;
        }else if(x==0){
          tab[0][y]=1;
        }else{
          tab[x][y]=tab[x-1][y]+tab[x][y-1];
        }
      }
    }

    for(int x=0;x<i;x++){
      for(int y=0;y<j;y++){
        System.out.print(tab[x][y]+" ");
      }
      System.out.println("");
    }
  }
}