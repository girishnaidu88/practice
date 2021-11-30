package medium;

public class reverseAnInteger {

    public static void main(String[] args) {
//        intReverseRecurrsion(123);
//        System.out.println();
//        intReverseRecurrsion(9812346);
//        System.out.println();
//        intReverseRecurrsion(0);
//        System.out.println();
//        System.out.println(intReverse(345));

        intRev(123);
    }

    public static void intReverseRecurrsion(int num){
        if(num < 10){
            System.out.print(num);
            return;
        }else{
            System.out.print(num%10);

            intReverseRecurrsion(num/10);
        }
    }

    public static int intReverse(int num){

        int result =0;

        while(num != 0){
            int tail = num % 10;
            int newResult = result *10 + tail;
            if((newResult-tail)/10 != result){
                return 0;
            }
            result=newResult;
            num = num/10;
        }

        return result;

    }

    public static void intRev(int num){
        StringBuffer sb = new StringBuffer();

        while(num >0){
            sb.append(num%10);
            num/=10;
        }

        System.out.println("The rev int is: "+Integer.valueOf(sb.toString()));
    }
}
