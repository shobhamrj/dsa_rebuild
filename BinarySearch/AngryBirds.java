package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class AngryBirds {
    
    public static int findMaxDistanceForBirds(ArrayList<Integer> nests, int birds) {
        Collections.sort(nests);
        int n = nests.size();
        int start = 0;
        int end = nests.get(n - 1) - nests.get(0);
        int result = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            boolean canPlace = canPlaceBirds(birds, n, nests, mid);

            if(canPlace) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static boolean canPlaceBirds(int birds, int n, ArrayList<Integer> nests, int mid) {
        int birdsPlaced = 1;
        int location = nests.get(0);
        for(int i = 1; i < nests.size(); i++) {
            int currentLocation = nests.get(i);
            if(currentLocation - location >= mid) {
                birdsPlaced++;
                location = currentLocation;

                if(birdsPlaced == birds) return true;

            }
        }
        return false;
    }
}
