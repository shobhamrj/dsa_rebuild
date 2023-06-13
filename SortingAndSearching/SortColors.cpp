class Solution {
public:
    void sortColors(vector<int>& nums) {
        int one=0, two=0, zero = 0;
        for(auto i: nums){
            if(i==0) zero++;
            if(i==1) one++;
            if(i==2) two++;
        }
        int i=0;
        while(zero--){
            nums[i] = 0;
            i++;
        }
        while(one--){
            nums[i] = 1;
            i++;
        }
        while(two--){
            nums[i] = 2;
            i++;
        }
    }
};