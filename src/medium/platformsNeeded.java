package medium;

import java.util.*;

public class platformsNeeded {
    public static void main(String[] args) {
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 210, 230,315, 600};

        System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep,6));
    }

    public static int findPlatformsRequiredForStation(int[] arr, int[] dep, int n){

        int platform_needed = 0, maxPlatforms = 0;
        Arrays.sort(arr);
        System.out.println("The sorted arr: "+Arrays.toString(arr));
        Arrays.sort(dep);
        System.out.println("The sorted dep: "+Arrays.toString(dep));
        int i = 0, j = 0;

        // Similar to merge in merge sort
        while (i < n && j < n)
        {
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms)
                    maxPlatforms = platform_needed;
            }
            else
            {
                platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
