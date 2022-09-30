class Solution {
    public List<List<String>> partition(String s) {
     
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> cur = new ArrayList<String>();
        
        recur(s,0,s.length(),cur,res);
        return res;
        
    }
    
    public void recur(String s, int ind, int n, List<String> cur, List<List<String>> res){
        
        
        if(ind == n)
        {
            res.add(new ArrayList<String>(cur));
            return;
        }
        
        for(int i = ind; i<n;i++)
        {
            if(isPalindrome(s,ind,i))
            {
                cur.add(s.substring(ind,i+1));
                recur(s,i+1,n,cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s, int ind1, int ind2)
    {
        while(ind1<ind2)
        {
            if(s.charAt(ind1)!=s.charAt(ind2))
            {
                return false;
            }
            ind1++;
            ind2--;
        }
        
        return true;
    }
    
}
