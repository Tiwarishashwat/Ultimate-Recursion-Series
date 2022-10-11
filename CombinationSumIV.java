class Solution {
    public int combinationSum4(int[] nums, int target) {
        // List<List<Integer>> res = new ArrayList<List<Integer>>();
        //res ind
        // int res[] = new int[1];/
        int res = 0;
        // ArrayList<Integer> cur = new ArrayList<Integer>();
         HashMap<Integer, Integer> dp = new  HashMap<Integer, Integer>();
        res = recur(target, nums, dp, 0);
        return res;
    }
    
    public int recur(int target, int nums[], HashMap<Integer, Integer> dp, int ind)
    {
        // base case
        if(target <= 0 || ind >= nums.length)
        {
            if(target == 0)
            {
                // System.out.println(cur);
                return 1;
            }
            return 0;
        }
        
        if(dp.containsKey(target))
        {
            return dp.get(target);
        }
            
        int res = 0;
         for(int i = 0; i<nums.length; i++)
         {
             if( nums[i] <= target)
             {
                // cur.add(nums[i]);
                res += recur(target - nums[i], nums, dp, i);
                // cur.remove(cur.size()-1);
             }
         }
        dp.put(target, res);
        return res;
        
    }
}
