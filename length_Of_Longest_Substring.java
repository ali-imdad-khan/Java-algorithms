class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        
        char[] list = s.toCharArray();
        
        List<Character> found = new ArrayList<Character>();

        int remove_start=0;
        
        for(int i=0;i<list.length;i++){
            
            if(!found.contains(list[i])){
                found.add(list[i]);
                
            }else{
                
                int remove_index=found.indexOf(list[i]);
                
                while(remove_start<=remove_index){
                    found.remove(0);
                    remove_start++;
                }
                remove_start=0;
                found.add(list[i]);
            }
            
            if(found.size()>max){
                max=found.size();
            }

        }
        return max;

        
        
    }
}
