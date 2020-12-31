class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[2];
        
        result[0] = findStartingIndex(nums,target);
        result[1] = findEndingIndex(nums,target);
        return result;
    }
    
    public int findStartingIndex(int[] nums,int target){
        int index = -1;
        
        int li = 0;
        int ri = nums.length - 1;
        
        while(li <= ri){
            
            int mid = li + (ri - li) / 2;  // not (li + ri)/2 , we used other to remove 
            
            if(nums[mid] >= target){ 
                ri = mid - 1;
            }else{
                li = mid+1;
            }
            
            if(nums[mid] == target) index = mid;
  
            
        }
        
        return index;
    }
    
    public int findEndingIndex(int[] nums,int target){
        int index = -1;
        int li = 0;
        int ri = nums.length - 1;
        
        while(li <= ri){
            
            int mid = li + (ri - li) / 2;  // not (li + ri)/2 , we used other to remove 
            
            if(nums[mid] <= target){
                li = mid+1;
            }else{
                ri = mid-1;
            }
            
            if(nums[mid] == target) index = mid;
            
        }
        
        return index;
    }
}
