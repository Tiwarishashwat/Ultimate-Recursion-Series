class Solution {
  public static void recur(int input[], int ind, ArrayList<Integer> output, int target, int sum){
  //base case
    if(ind == input.length)
    {
      if(sum == target)
      {
          System.out.println(output)
      }
      return;
    }
    // pick
    output.add(input[ind]);
    sum += input[ind];
    recur(input, ind+1, output, target, sum);
    
    //no pick
    output.remove(output.size()-1);
    sum -= input[ind];
    recur(input, ind+1, output, target, sum);
  }
}
