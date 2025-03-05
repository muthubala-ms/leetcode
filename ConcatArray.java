/**
 *  qeustion : 1929. Concatenation of Array
*/

import java.util.Arrays;

public class ConcatArray{

    public static void main(String[] args){
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }

    // this method take an array and return new array name as ans with doblue values
    
    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
};