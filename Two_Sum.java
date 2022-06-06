/*
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
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int i1=0;
        int i2=0;
        
        int[] result=new int[2];
        
        for (int i = 0 ; i< nums.length; i++ ){
            
            
            if(hash.get(nums[i])!=null){
            
                result[0]=hash.get(nums[i]);
                
                result[1]=i;
                
                break;
           
            }
            
            else{
            
                hash.put(target - nums[i], i); 
            
            }
            
            
        }
        
        return result;
        
    }
}
