class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int m = triangle.size();
        vector<vector<int>>dp(m);
        dp[0].push_back({triangle[0][0]});
        for(int i=1; i<m; i++){
            vector<int> temp;
            int t;
            for(int j=0; j<triangle[i].size(); j++){
                if(j==0) t = (dp[i-1][j]) + triangle[i][j];
                else if(j==(triangle[i].size()-1)) t = (dp[i-1][j-1]) + triangle[i][j];
                else t = min(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
                // temp.push_back(t);
                dp[i].push_back(t);
            }
            // dp[i] = (temp);
        }
        int ans = dp[m-1][0];
        for(int i=1; i<dp[m-1].size(); i++) ans = min(ans, dp[m-1][i]);

        return ans;
    }
};