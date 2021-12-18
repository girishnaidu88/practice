package medium;

public class rectangleArea {
    public static void main(String[] args){
        System.out.println(findArea(-3,0,3,4,0,-1,9,2));
        System.out.println(findArea(-2,-2,2,2,-2,-2,2,2));
    }

    public static int findArea(int A, int B, int C, int D, int E, int F, int G, int H){
        int rectOne=(C-A) * (D-B);
        int rectTwo=(G-E) * (H-F);

        if(A>=G || B>=H || C<=E || D<=F){
            return rectOne+rectTwo;
        }

        int length=Math.min(C,G)-Math.max(A,E);
        int height=Math.min(D,H)-Math.max(B,F);

        return (rectOne+rectTwo)-(length*height);
    }

}
