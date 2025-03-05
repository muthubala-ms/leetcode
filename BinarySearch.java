/**
 *  qeustion : 704. Binary Search
*/

public class BinarySearch{
    public static void main(String[] args){
        System.out.println(search(new int[]{-1,0,3,5,9,12} , 9));
    }
    // this fucntion table an nums array and taget value if the element are find then return the value otherwise return -1
    static public int search(int[] nums, int target) {
        int start = 0 , end = nums.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(target < nums[mid])
                end = mid -1;
            else if(nums[mid] == target ){
                return mid;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
};