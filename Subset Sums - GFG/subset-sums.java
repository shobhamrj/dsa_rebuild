//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    ArrayList<Integer> res = new ArrayList<>();
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        int idx = 0;
        int sum = 0;
        findSum(arr, idx, sum);
        return res;
    }
    
    void findSum(ArrayList<Integer> arr, int idx, int sum) {
        if(idx == arr.size()) {
            res.add(sum);
            return;
        }    
        findSum(arr, idx + 1, sum + arr.get(idx));
        findSum(arr, idx + 1, sum);
    }
}