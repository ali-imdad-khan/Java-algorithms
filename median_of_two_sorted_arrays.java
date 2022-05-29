class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int mergedLength=nums1.length+nums2.length;
        
        int[] mergedArray=new int[mergedLength];
        
        int count1=0;
        int count2=0;
        for(int i=0;i<mergedLength;i++ ){
            if(count1==nums1.length){
                    mergedArray[i]=nums2[count2];
                    count2 += 1;
            }
            else if (count2==nums2.length){
                    mergedArray[i]=nums1[count1];
                    count1 += 1;            
            }
            else{
                if(nums1[count1]<=nums2[count2]){
                    mergedArray[i]=nums1[count1];
                    count1 += 1;
                }else{
                    mergedArray[i]=nums2[count2];
                    count2 += 1;
                }
            }
            
        }

        int half=0;
        if(mergedLength % 2 == 0 ){
            half= ((int)mergedLength/2)-1;

        System.out.println(half);
       

            return ((double)(mergedArray[half]+mergedArray[half+1]))/2.0;
        }
        else{
            half=(int)(mergedLength / 2.0);
            return (double)mergedArray[half];
        }
                
    }
}
