class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> res = new ArrayList<>();
       
       res.add(new ArrayList<>());
       res.get(0).add(1);
       for(int i = 1 ;i<=n;i++)
       {
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        for(int j = 1;j<i;j++)
        {
            cur.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        }
        cur.add(1);
        res.add(cur);
       }

    //    if(n == 0)
    //    {
    //     return res.get(0);
    //    }

       return res.get(n);
    }
}