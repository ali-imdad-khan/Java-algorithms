class Solution {
    public int removeDuplicates(int[] nums) {
        
        
   int count=0;
        int size=nums.length;
        
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[count++] = nums[i];
            }
        }
  
        nums[count++] = nums[size - 1];
  
        return count;
    }
    

}
