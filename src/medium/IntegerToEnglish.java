package medium;

public class IntegerToEnglish {

    static String[] oneTo19 = {"","One","Two","Three","Four","Five","Six","Seven","Eight"
            ,"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
            "Eighteen","Nineteen"};
    static String[] twentyTo100 = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy"
            ,"Eighty","Ninety"};

    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(12334));
        System.out.println(numberToWords(10000001));
        System.out.println(numberToWords(0));
    }

    public static String numberToWords(int num) {
        if(num==0)
            return "Zero";
        else
            return cal(num);
    }

    public static String cal(int num){
        if(num<20)
            return oneTo19[num];
        else if(num<100)
            return twentyTo100[num/10] +(num%10==0? "":" "+oneTo19[num%10]);
        else if(num<1000)
            return oneTo19[num/100]+" Hundred"+(num%100==0?"":" ")+cal(num%100);
        else if(num<1000000)
            return cal(num/1000)+" Thousand"+(num%1000==0?"":" ")+cal(num%1000);
        else if(num<1000000000)
            return cal(num/1000000)+" Million"+(num%1000000==0?"":" ")+cal(num%1000000);
        else if(num>=1000000000)
            return cal(num/1000000000)+" Billion"+(num%1000000000==0?"":" ")+cal(num%1000000000);
        return null;
    }

}
