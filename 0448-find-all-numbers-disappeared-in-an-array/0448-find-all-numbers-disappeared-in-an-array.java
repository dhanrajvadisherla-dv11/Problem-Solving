class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count = 0;
        int[] n = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            n[nums[i] - 1] = 1; 
        }

        for(int i  = 0;i < nums.length;i++)
        {
            if(n[i] == 0)
            {
                list.add(i + 1);
            }
        }
        return list;
    }
}