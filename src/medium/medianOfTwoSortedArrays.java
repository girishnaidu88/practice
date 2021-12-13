package medium;

public class medianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1=new int[]{1,3,5,6};
        int[] nums2=new int[]{2,4,7};

        System.out.println(medianofArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double medianofArrays(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int[] a = new int[m+n];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                a[k]=nums1[i];
                i++;
            }else{
                a[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            a[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n){
            a[k]=nums2[j];
            j++;
            k++;
        }

        if((m+n)%2!=0){
            return a[(m+n)/2];
        }else{
            int x=(m+n)/2;
            double p=a[x];
            double q=a[x-1];
            return (p+q)/2;
        }

    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length) return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0, high = n1;

        while(low <= high) {
            int cut1 = (low+high) >> 1;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;


            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];


            if(left1 <= right2 && left2 <= right1) {
                if( (n1 + n2) % 2 == 0 )
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                else
                    return Math.max(left1, left2);
            }
            else if(left1 > right2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}
