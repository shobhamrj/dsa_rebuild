long long rev(long long x){
    int r, ans = 0;
    while(x>0){
        r = x%10;
        ans = ans*10 + r;
        x = x/10;
    }
    return ans;
}


class Solution {
public:
    int countNicePairs(vector<int>& nums) {
        long long ans = 0, n = nums.size();
        unordered_map<long long, long long>a;
        for(int i=0; i<n; i++){
            nums[i] = rev(nums[i]) - nums[i];
            int t = nums[i];
            ans = ans + a[t];
            a[t]++;
            // if(a[rev(nums[i]) - i] > 0) ans += a[rev(nums[i]) - i];
            // a[rev(nums[i]) - i]++;
        }
        return ans % (1000000000 + 7);
    }
};