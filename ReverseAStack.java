
//User function Template for Java

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        // LOF
        if (s.size() == 0)
        {
            return;
        }
        int ele = s.pop();
        reverse(s);
        insertAtBottom(s, ele);
    }
    
    static void insertAtBottom(Stack<Integer> s, int ele){
        
        if(s.isEmpty())
        {
            s.push(ele);
            return;
        }
        
        int newEle = s.pop();
        insertAtBottom(s, ele);
        s.push(newEle);
        
    }
}


