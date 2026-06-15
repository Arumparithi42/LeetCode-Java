class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        HashMap<Integer,Integer> map = new HashMap<>(); // complement and index
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                result = new int[] {map.get(nums[i]), i};
                break;
            }
            map.put(target - nums[i], i);   
        }
        return result;
    }
}