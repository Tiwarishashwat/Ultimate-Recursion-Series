class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(candidates);
        recur(candidates, target, 0, cur, res);
        return res;
    }
    
     public void recur(int[] candidates, int target, int ind, ArrayList<Integer> cur, List<List<Integer>> res)
    {
        // base case
        
            if(target == 0)
            {
                res.add(new ArrayList<Integer>(cur));
                return;
            }

         for(int i = ind; i< candidates.length;i++)
         {
             if( (i == ind || candidates[i-1] != candidates[i] ) && candidates[i] <= target)
             {
                 cur.add(candidates[i]);
                recur(candidates, target - candidates[i], i+1, cur, res);
                cur.remove(cur.size()-1);
             }
         }
        
    }
}
