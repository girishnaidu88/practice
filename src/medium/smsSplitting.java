package medium;

import java.util.*;

public class smsSplitting {

    public static void main(String[] args) {
        String ip1="njdksjfn jdfnds kjfdklsjf jsdofjsd f jdslkjfgdslkngdslkjg fljksdjflsfdsjfdslkfjdslkfmdsklmfgn ljsdglkdsfg d lkjgdslkgjdsljgdslkjgdsfjngds lkjsdlkgjdsgkldsjgsdlkg lkjdslkgjdslkgjdslgmnds glkjgdslkjgdslkjfgodsjfds g,mdsgkjdsngdlsknfgldsjfglkdsjfglkdsjglkdsjglkdsgjdsklgjdslk lkgjdslkgfjdslkgjdslkgjdsljfgdslkgjmdslkg kljghjdslkjgdslkjfg";

        String ip2 = "njdksjfnjdfndskjfdklsjfnjdksjfnjdfnds kjfdklsjfnjdksjfnjdfndskjfdklsjf njdksjfnjdfndskjfdklsjfnjdksjfnjdfnds kjfdklsjfnjdksjfnjdfndskjfdklsjffgfhfgfhgjkjhsfkjdsfkjdsfljsdgflkjdshflkasdjhflksdjfnbkdsnbsdnfsdfsd";

        String ip3 = "njdksjfn jdfnds kjfdklsjf jsdofjsd f jdslkjfgdslkngdslkjg fljksdjflsfdsjfds lkfjdslkfmdsklmfgn ljsdglkdsfg d lkjgdslkgjds ljgdslkjgdsfjngds1 3534ttttttttttta njdksjfn jdfnds kjfdklsjf jsdofjsd f jdslkjfgdslkng dslkjg fljksdj flsfdsjfdslk fjdslkfmdsklmfgn ljsdglkdsfg d lkjgdslkgjds ljgdslkjg dsfjngds1 3534ttttt tttttt njdksjfn jdfnds kjfdklsjf jsdofjsd f jdslkjfgdslkngdslkjg fljksdjflsfdsjfds lkfjdslkfmdsklmfgn ljsdglkdsfg d lkjgdslkgjds ljgdslkjgdsfjngds1 3534ttttttttttta";

        List<String> outPut=getSplits(ip1);
        System.out.println(outPut.toString());

        outPut=getSplits(ip2);
        System.out.println(outPut.toString());

        List<String> outPut1=getSplits(ip3);
        System.out.println(outPut1.toString());
    }

    public static List<String> getSplits(String message){
        List<String> result = new ArrayList<>();
        if (message.length() < 160) {
            result.add(message);
            return result;
        }

        int maxlen = 154;
        int s = 0, e = s + maxlen;
        while (e < message.length()) {
            if (message.charAt(e) != ' ') {
                while (e >= s && message.charAt(e) != ' ' && message.charAt(e + 1) != ' ') {
                    e--;
                }
            }
            result.add(message.substring(s, e+ 1));
            s = e + 1;
            e = s + maxlen;
        }
        result.add(message.substring(s, message.length()));

        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i)+"(" + (i + 1) + "/" + (result.size()) + ")");
        }
        return result;
    }
}
