class Solution {
    int sum;
    int[] memo;
    private int dp(int level, int[] nums){
        if (level >= nums.length){
            return 0;
        }
        if (memo[level] != -1){
            return memo[level];
        }
        sum = dp(level+2, nums) + nums[level]; // taken
        sum = Math.max(sum, dp(level+3, nums) + nums[level]); // taken
        return memo[level] = sum;
    }
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int sum1 = dp(0, nums);
        sum = 0;
        int sum2 = dp(1, nums);
        System.out.println(sum1);
        System.out.println(sum2);
        return Math.max(sum1, sum2);
    }
}