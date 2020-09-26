https://leetcode.com/problems/unique-paths/submissions/


class Solution {
    
    public int uniquePaths(int m, int n) {
        int arr[][] =new int[m][n];
        int t[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                t[i][j]=-1;
        }
      return  uniquePaths(0, 0, m, n, arr, t);  
      
        
    }
    
    public int uniquePaths(int i, int j, int m, int n, int arr[][], int t[][]){
        if(i==m || j==n)
          return 0;
    
        if(i==m-1 && j==n-1)
          return 1;
        
        if(t[i][j]!=-1)
            return t[i][j];
    
        int c1 = uniquePaths(i+1, j, m, n, arr, t);
        int c2 = uniquePaths(i, j+1, m, n, arr, t);
        t[i][j] = c1+c2;
        return t[i][j];
    
  }
}
