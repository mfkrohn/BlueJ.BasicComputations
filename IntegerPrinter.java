 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String bi = Integer.toBinaryString(value);
        return bi;
    }

    public String printIntegerAsOctal(int value){
        String bi = Integer.toOctalString(value);
        return bi;
    }

    public String printIntegerAsHexadecimal(int value){
        String bi = Integer.toHexString(value);
        return bi;
    }

    public static void main(String[] args){

    }
}
