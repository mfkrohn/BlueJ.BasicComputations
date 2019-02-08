 

import java.util.Scanner;
public class ShortCalculator {
  public static void main (String[] args){
     boolean go = true;
      Scanner scanner1 = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      Scanner scanner3 = new Scanner(System.in);
      short s = 0;
      short rem = 0;
      while(go) {
      System.out.println("Number 1 please.");
      int i1 = scanner1.nextInt();
      
      System.out.println("Number 2 please.");
      int i2 = scanner1.nextInt();
      
      System.out.println("Please type operator sign (+,-,*,/)");
      String sign = scanner3.nextLine();
      
      short s1 = (short)i1;
      short s2 = (short)i2;
      if(sign.equals("+")){
          s = (short)(s1 + s2); 
          System.out.println(s);
        }
        else if(sign.equals("-")){
          s = (short)(s1 - s2);   
          System.out.println(s);
        }
        else if(sign.equals("*")){
          s = (short)(s1 * s2); 
          System.out.println(s);
        }
        else if(sign.equals("/")){
          s = (short)(s1 / s2);
          rem = (short)(s1 % s2);
          System.out.println("" + s + " remainder: " + rem);
        }
        else{
           System.out.println("Sign not recognized"); 
        }
    
        
        

        
      
      
      System.out.println("Type yes to continue");
      String brk = scanner2.nextLine();
      if(brk.equalsIgnoreCase("yes")){
          System.out.println("Ok, let's go again");
          System.out.println("");
        }
        else{
         go = false;   
        }
      
    }
      
    }
    
    
    
}
