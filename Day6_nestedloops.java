public class Day6_nestedloops {
    public static int[] twoSum int arr[], int target){
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target =9;
        int[] result=twoSum(arr, target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    
}


        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("a");
        //     }
        //     System.out.println();
        // }
      
        /*
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

code:
class Solution {
    public int[] twoSum(int[] arr, int target) {
                int[] result = new int[2];
            for(int i=0;i<arr.length;i++){
                 for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
         return result;
    }

}