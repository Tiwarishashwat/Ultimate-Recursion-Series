import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("N Queen Problem");
		int N=4;
		int sol[][] = new int[N][N];
		
        if (solve(0,sol, N) == true){
            printSol(sol);
        }
        else{
            System.out.println("Solution does not exist");
        }
	}
	
	public static void printSol(int sol[][]){
	    
	    for(int i=0;i<sol.length;i++)
	    {
	        for(int j=0;j<sol[i].length;j++)
	        {
	        System.out.print(sol[i][j] +" ");
	    }
	    System.out.println();
	    }
	}
	
	public static boolean isSafe(int sol[][], int row, int col, int N)
	{
	    
	    // left side of same row
	    
	    for(int i=0;i<col;i++)
	    {
	        if (sol[row][i] == 1){
	            return false;
	        }
	    }
	    
	    // upper diagonal
	    
	    for(int i=row,j=col; i>=0 && j>=0; i--,j--)
	    {
	        if (sol[i][j] == 1){
	            return false;
	        }
	    }
	    
	    // lower diagonal
	    
	    for(int i=row,j=col; i<N && j>=0; i++,j--)
	    {
	        if (sol[i][j] == 1){
	            return false;
	        }
	    }   
	    return true;
	}
	
	public static boolean solve(int col, int sol[][], int N){
	    //base case
	    if(col >= N)
	    {
	        return true;
	    }
        
        for(int row = 0; row<N; row++)
        {
            if(isSafe(sol, row, col, N)){
                sol[row][col] = 1;
                if( solve(col+1, sol, N)==true ){
                    return true;
                }
                sol[row][col] = 0;
            }
        }
        return false;
	}	
}
