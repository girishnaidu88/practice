package medium;

public class printSpiralMatrix {

    public static void main(String[] args)
    {
        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        // Function Call
        spiralPrint(a.length, a[0].length, a);

        System.out.println("\n");
        int a1[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7,8,9 } };

        spiralPrint(3,3,a1);

    }

    public static void spiralPrint(int m, int n, int[][] a){
        int i, k=0, l=0;

        while(k<m && l<n){

            //Print first row
            for(i=0;i<n;++i){
                System.out.print(a[k][i]+" ");
            }
            k++;


            //Print last column
            for(i=k; i<m; ++i){
                System.out.print(a[i][n-1]+" ");
            }
            n--;

            //Print last row
            if(k<m){
                for(i=n-1; i>=1;--i){
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }


            //Print first column
            if(l<n){
                for(i=m-1; i>=k;--i ){
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }

        }
    }
}
