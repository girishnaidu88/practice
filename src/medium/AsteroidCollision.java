package medium;

import java.util.*;

public class AsteroidCollision {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(astCollision(new int[]{5,10,-5})));
        System.out.println(Arrays.toString(astCollision(new int[]{10,2,-5})));
        System.out.println(Arrays.toString(astCollision(new int[]{8, -8})));
    }

    public static int[] astCollision(int[] ast){
        LinkedList<Integer> s=new LinkedList<>();

        for(int i=0; i<ast.length; i++){
            if(ast[i]>0 || s.isEmpty() || s.getLast() <0){
                s.add(ast[i]);
            }else if(s.getLast() <= -ast[i]){
                if(s.pollLast() < -ast[i]){
                    i--;
                }
            }
        }
        return s.stream().mapToInt(i->i).toArray();
    }

}
