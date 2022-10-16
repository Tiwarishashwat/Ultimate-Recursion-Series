
// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res = new ArrayList<String>();
        solve(m,0,0,n, "", res);
        return res;
    }
    
    public static void solve(int mat[][], int i, int j, int n, String path, ArrayList<String> res){
        
        
        // dead ends
        if(i<0 || i >= n || j <0 || j>=n || mat[i][j] == 0 || mat[i][j] == 2){
            return;
        }
        
        
        //base case
        if(i == n-1 && j == n-1){
            res.add(path);
            return;
        }
                
        // all operations
        // visit
        int orig =  mat[i][j];
         mat[i][j] = 2;
        // 4 options
       
        solve(mat, i-1, j, n, path + "U", res);
        solve(mat, i+1 , j, n, path + "D", res);
        solve(mat, i, j-1, n, path + "L", res);
        solve(mat, i, j+1, n, path + "R", res);
        mat[i][j] = orig;
    }
}
