
// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int ans = bSearch(arr, 0, n-1 , k);
        return ans;
    }
    
    int bSearch(int arr[], int lo, int hi, int target){
        
        
        if(lo > hi){
            return -1;
        }
        
        int mid = lo + (hi-lo)/2;
        
        if(arr[mid] == target){
            return mid;
        }
        
        else if (target < arr[mid]) {
            return bSearch(arr, lo, mid -1 , target);
            
        }
        
        else {
            
            return bSearch(arr, mid + 1, hi , target);
            
        }
        
        
    }
    
}









