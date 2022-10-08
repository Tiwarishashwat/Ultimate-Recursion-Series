class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        recur(k, n, 1, cur, res);
        return res;
    }
    
     
     public void recur(int k, int target, int element, ArrayList<Integer> cur, List<List<Integer>> res)
    {
        // base case
        if(cur.size() >= k)
        {
            if(target == 0)
            {
                res.add(new ArrayList<Integer>(cur));
            }
               return;
        }
            

         for(int el = element; el<= 9; el++)
         {
             if( el <= target)
             {
                 cur.add(el);
                recur(k, target - el, el+1, cur, res);
                cur.remove(cur.size()-1);
             }
         }
        
    }
}
