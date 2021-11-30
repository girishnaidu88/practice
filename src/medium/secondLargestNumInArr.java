package medium;

public class secondLargestNumInArr {

    public static void main(String[] args) {
        int a[]={-1, -6,-2, 3, -4, -15};
        int b[]={1, 6,2, 3, 4, 15};

        System.out.println(secondLargest(a));
        System.out.println("The second function");
        System.out.println(secLargest(a));

        System.out.println("_______________");
        System.out.println(secondLargest(b));
        System.out.println("The second function");
        System.out.println(secLargest(b));
    }

    public static int secondLargest(int[] a){
        int firstlargest=a[0]; // 1
        int secondLargest=a[1]; // 6

        if(secondLargest> firstlargest){
            int temp=firstlargest;
            firstlargest=secondLargest;
            secondLargest=temp;
        }

        for(int i=2; i<a.length; i++){
            if(a[i]>=firstlargest){
                secondLargest=firstlargest;
                firstlargest=a[i];
            }else if(a[i]<firstlargest && a[i]>= secondLargest){
                secondLargest=a[i];
            }
        }

        return secondLargest;
    }

    public static int secLargest(int a[]){
        int fLarge=Integer.MIN_VALUE;
        int sLarge=Integer.MIN_VALUE;
        System.out.println("The flarge: "+ fLarge);
        System.out.println("The slarge: "+ sLarge);

        for(int i: a){
            if(i > fLarge){
                sLarge=fLarge;
                fLarge=i;
            }else if(i > sLarge){
                sLarge=i;
            }
        }
        return sLarge;
    }

}
