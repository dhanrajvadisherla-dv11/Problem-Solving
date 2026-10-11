class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0;i < nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            else
            {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            if (map.get(nums[i]) == 2)
            {
                ret[0] = nums[i];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                ret[1] = i;
            }
        }
        return ret;
    }
}