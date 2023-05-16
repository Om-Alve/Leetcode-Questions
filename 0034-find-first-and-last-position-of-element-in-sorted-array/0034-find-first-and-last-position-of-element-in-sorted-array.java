class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int s=0,e=nums.length-1;
        int mid;
        while(s<=e){
            mid = s+ (e-s)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                e = mid-1;
            }
            else if(nums[mid]>target){
                e = mid - 1;
            }
            else{
                s = mid+1;
            }
        }
        s=0;
        e=nums.length-1;
        while(s<=e){
            mid = s+ (e-s)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                s = mid+1;
            }
            else if(nums[mid]>target){
                e = mid - 1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}