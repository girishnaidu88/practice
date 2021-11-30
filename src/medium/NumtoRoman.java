package medium;

public class NumtoRoman {

    public static void main(String[] args) {
        toRoman(1001);
        toRoman(1002);
        toRoman(11);
        toRoman(999);
    }

    public static void toRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                num =num-values[i];
                sb.append(strs[i]);
            }
        }
        System.out.println("The integer number given: "+num+" the equivalent roman number is: "+sb.toString());
    }

}
