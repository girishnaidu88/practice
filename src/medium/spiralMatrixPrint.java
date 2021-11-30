package medium;

public class spiralMatrixPrint {


    public static void main(String[] args){
        int a[][] = { { 1, 2, 3, 4},
                { 5, 6, 7, 8 },
                { 9, 10,11,12 },
                {13, 14, 15, 16} };

        int a1[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7,8,9 } };

        int a2[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        int[][] a3={{1},{2},{3},{4},{5}};

        spiralPrint(a1, 3, 3);
        System.out.println();
        spiralPrint(a, a.length, a[0].length);
        System.out.println();
        spiralPrint(a2, a2.length, a2[0].length);
        System.out.println();
        spiralPrint(a3, a3.length, a3[0].length);

    }

    public static void spiralPrint(int[][] a, int m, int n){

        int top=0, down=m-1, left=0, right=n-1;
        int dir=0;

        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left; i<=right; i++){
                    System.out.print(a[top][i]+" ");
                }
                top++;
            }else if(dir==1){
                for(int i=top; i<=down;i++){
                    System.out.print(a[i][right]+" ");
                }
                right--;
            }else if(dir==2){
                for(int i=right; i>=left; i--){
                    System.out.print(a[down][i]+" ");
                }
                down--;
            }else if(dir==3){
                for(int i=down; i>=top; i--){
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }

            dir=(dir+1)%4;
        }
    }

}
