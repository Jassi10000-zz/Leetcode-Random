class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        vector<int>result(2);
        result[0] = printStartingIndex(nums,target);
        result[1] = printEndingIndex(nums,target);
        return result;
    }
    
    int printStartingIndex(vector<int>& nums,int target){
        int index=-1;
        int li = 0;
        int ri = nums.size()-1;
        
        while(li <= ri){
            
            int mid = li + (ri-li)/2;
            
            if(nums[mid] >= target){
                ri = mid-1;
            }else{
                li = mid+1;
            }
            
            if(nums[mid] == target) index=mid;
            
            
        }
        return index;
    }
    
    int printEndingIndex(vector<int>& nums,int target){
        
        int index=-1;
        int li = 0;
        int ri = nums.size()-1;
        
        while(li <= ri){
            
            int mid = li + (ri-li)/2;
            
            
            if(nums[mid] <= target){
                li = mid+1;
            }else{
                ri = mid-1;
            }
            
            if(nums[mid] == target) index=mid;
            
           
        }
        return index;
    }
};
