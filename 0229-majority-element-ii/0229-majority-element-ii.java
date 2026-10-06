class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int count = 1;
        List<Integer> list = new ArrayList<>();

        // Check first element
        if (count > n / 3) {
            list.add(nums[0]);
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > n / 3) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                }
            }
        }

        return list;
    }
}