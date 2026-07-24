class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        if (nums.length==0){
            return 0;
        }
        int maxLength=0;
            for(int i=0;i< nums.length; i++){
                  set.add(nums[i]);
        } 
       for(int i = 0; i < nums.length; i++){
            int current=nums[i];
            if (set.contains(nums[i]-1)){
                
                continue;
            } else{
             int length=1;
             while(set.contains(current+1)){
                length++;
                current++;
                
                
                
            }
            if (maxLength<length){
            maxLength=length;
             }
        }

        
        }
return maxLength;
        }
          }

