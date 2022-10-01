class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        recur(candidates, target, 0, cur, res);
        return res;
    }
    
    public void recur(int[] candidates, int target, int ind, ArrayList<Integer> cur, List<List<Integer>> res)
    {
        // base case
        
        if(ind == candidates.length)
        {
            if(target == 0)
            {
                res.add(new ArrayList<Integer>(cur));
            }
            return;
        }
        
        // pick
        
        if(candidates[ind] <= target){
            cur.add(candidates[ind]);
            recur(candidates, target - candidates[ind], ind, cur, res);
            cur.remove(cur.size()-1);
        }
        // no pick
        recur(candidates, target, ind+1, cur, res);
        
    }
}
