public long toh(int N, int from, int to, int aux) {
        // Your code here
        
        long moves[] = new long[1];
        
        tower(N,from,to,aux,moves);
        
        return moves[0];
        
    }
    
    public void tower(int N, int from, int to, int aux, long moves[])
    {
//         from is source
//          to is target
          
      
        //base case
        if(N==0)
        {
            return;
        }
        
        moves[0]++;
        // move n-1 disks from source to aux using target rod     
        tower(N-1,from,aux,to,moves);
        
        // move nth disk from source to destination
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        
        //move remaining n-1 th disks from aux to target using source rod
        tower(N-1,aux,to,from,moves);
        
    }
