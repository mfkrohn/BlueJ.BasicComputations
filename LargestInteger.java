 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int c1 = (integers[0] > integers[1]) ? integers[0] : integers[1];
        int c2 = (c1 > integers[2]) ? c1 : integers[2];
        //int c1 = 0;
        //if((integers[0] > integers[1]) && (integers[0] > integers[2])){
          //c1 = integers[0];   
        //}else if((integers[2] > integers[0]) && (integers[1] > integers[2])){
         //c1 = integers[1];   
        //}else {
          //c1 = integers[2];   
        //}
        //return c1
        return c2;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int c1 = Math.max(integers[0] , integers[1]);
        int c2 = Math.max(integers[2] , c1);
        return c2;
    }
}
