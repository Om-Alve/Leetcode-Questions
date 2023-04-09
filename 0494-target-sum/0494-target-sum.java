class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0);
    }
    static int solve(int[] arr,int target,int sum){
        if(arr.length==0){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        return solve(Arrays.copyOfRange(arr,1,arr.length),target,sum+arr[0])+        solve(Arrays.copyOfRange(arr,1,arr.length),target,sum-arr[0]);
    }
}