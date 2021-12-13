package medium;

public class medianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1=new int[]{1,3,5,6};
        int[] nums2=new int[]{2,4,5,8};

        System.out.println(medianofArrays(nums1, nums2));
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
}
