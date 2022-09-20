class Solution {
    public void reverseString(char[] s) {
        
        recur(s,0);
    }
    
    public void recur(char s[], int index)
    {
        if(index==s.length/2)
            return;
        
        recur(s,index+1);
        swap(s,index,s.length-index-1);
    }
    
    public void swap(char s[], int i1, int i2)
    {
        char temp = s[i1];
        s[i1] = s[i2];
        s[i2] = temp;
    }
    
   
}
