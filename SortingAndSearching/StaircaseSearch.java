public class StaircaseSearch {
    
    //given a M x N matrix which is row wise and column wise sorted. You have to search the index of a given integer K in the matrix.
    public static int[] search(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m - 1;
        
        while(i < n && j >= 0) {
            if(arr[i][j] == target) 
                return new int[] {i, j};
            if(arr[i][j] > target)
                j--;
            else
                i++;
        }
        return new int[] {-1, -1};
    }
}
