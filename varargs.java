import java.util.*;
class varargs
{
    public static void main(String[] args) {
      varargs O1=new varargs();//creating an object to call functions
      O1.trialFunc("a","h","rth");//calling function with 3 parameters
      O1.trialFunc("k","j","gff","erwh","esfgdhf","wqewret");//calling function with 6 parameters
      O1.trialFunc();//calling function with 0 parameters
    }
    void trialFunc(String... s)//passing varibale number of arguments
    {
      String ss="";
      System.out.println("Number of arguments passed: "+s.length);//checking numer of arguments passed
      for(int i=0;i<s.length;++i){
        ss+=s[i];
      }
      System.out.println(ss);
    }
}
