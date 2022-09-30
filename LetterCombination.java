class Solution 
{    
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> numSeq = new ArrayList<String>();
        recur(digits,0,"",numSeq,map);
        return numSeq;
        
    }
    
    public void recur(String digits, int index, String cur,List<String> numSeq, HashMap<Character,String> map){
        
        //base case
        if(index == digits.length())
        {
            if(cur!="")
            {
                numSeq.add(cur);
            }
            
            return;
        }
        
        char curDigit = digits.charAt(index); // '2'
        String curAplphabets = map.get(curDigit);  //"abc"
            
        for(int i=0;i<curAplphabets.length();i++)
        {
            cur += curAplphabets.charAt(i);
            recur(digits, index+1, cur,numSeq,map);
            cur = cur.substring(0,cur.length()-1);
        }
        
    }
}
