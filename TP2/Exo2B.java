public class Exo2B{

  public static void main(String[] args){
    gen_bin_gray(3,"");
  }

  public static void gen_bin_gray(int n, String str){
    if(n==0){
      System.out.println(str);
    }else{
      gen_bin_gray(n-1,"0" + str);
      String newStr ="";
      /*for(int x=0;x<str.length();x++){
        if(str.charAt(x) == '1'){
          newStr+="0";
        }else{
          newStr+="1";
        }
      }*/
      for(int x=0;x<str.length();x++){
        newStr=str.charAt(x)+newStr;
      }
      gen_bin_gray(n-1,"1"+newStr);
    }
  }
}