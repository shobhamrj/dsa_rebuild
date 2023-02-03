package BinarySearch;

public class SquareRoot {

    // find the square root for n upto p decimal places
    public static float findSqrt(int n, int p) {
        int start = 0;
        int end = n;
        float ans = 0;
        
        // for finding integer part of the square root binary search used
        while (start <= end) {
            int mid = (start + end) / 2;

            if(mid * mid == n) return mid;

            else if(mid * mid < n) {
                ans = mid;
                start = mid + 1;
            }

            else end = mid - 1;
        }

        // for decimal part, linear search could be easy and helpful since [0..9] is only the option
        float inc = 0.1f;

        for(int place = 1; place <= p; place++) {
            while(ans * ans <= n) ans += inc;
            ans -= inc;
            inc /= 10.0;
        }
        return ans;
    }
    
}
