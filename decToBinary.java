class Solution{
	void toBinary(int N) {
		//Write your code here
		 if(N==0)
		    return;
		 toBinary(N/2);
		 System.out.print(N%2);
	}
}
