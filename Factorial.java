 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        
        BigInteger ans = new BigInteger("1");
        for(int i = 1; i < value+1; i++){
            ans = ans.multiply(new BigInteger(i + ""));
        }
        
        return ans;
    }

}
