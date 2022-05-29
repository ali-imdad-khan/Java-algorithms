////////Brute Force Merging sorted arrays approach

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


///////Using Binary Search to find Median O(log(min(N,M))

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int mergedLength=nums1.length+nums2.length;
        
        
        double median1=median(nums1, nums1.length);

        double median2=median(nums2, nums2.length);
        
        if(median1==median2){
            return median1;
        }
        
        else if(median1 < median2){
            
            return 
                
                findMedianSortedArrays(
                Arrays.copyOfRange(nums1, (nums1.length-1)/2, nums1.length)
                ,subArray(nums2,0, (int)median2)
                
            );
        }
        else{
            
            return 
                findMedianSortedArrays(
                subArray(nums1,0, (int)median1)
                ,Arrays.copyOfRange(nums2, (nums2.length-1)/2, nums2.length)
            );
                        
        }
 }

    double median(int[] input_array, int size){
  
        
        if(size % 2 == 0 ){
            System.out.println(input_array[(size/2) - 1 ]);
            System.out.println(input_array[(size/2) ]);
            return ((double)(input_array[(size/2) - 1 ]+input_array[size/2]))/2.0;
        }
        else{

            return (double)input_array[size/2];
        }
    }
    
    int[] subArray(int[] input,int begin, int end){
        
        int[] result=new int[(end - begin)+1];
        int count=0;
        for(int i=0;i<input.length;i++){
            if(i >= begin && i<= end){
                result[count]=input[i];
                count+=1;
            }
        }
        return result;
    }
    
    
}
