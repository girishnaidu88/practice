package easy;

public class PalidromeNumber {

    public static void main(String[] args){
        int num=121;
//        System.out.println(numPalindrome(num));
        int res=numPalindrome(num);
        if(num==res){
            System.out.println("The number given is palindrome: "+res);
        }else{
            System.out.println("Not a palnidrome number: "+ res);
        }

    }

    public static int numPalindrome(int num){
        int result=0;

        if(num < 0){
            return -1;
        }else{
            while(num != 0){
                int tail=num%10;
                int newResult= result * 10 + tail;
                if((newResult-tail)/10 !=result){
                    return 0;
                }
                result=newResult;
                num = num/10;
            }
        }

        return result;
    }

}
