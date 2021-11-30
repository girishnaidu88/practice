package medium;

import java.text.*;
import java.util.*;

public class DateFormat {

    public static void main(String[] args) {
        custDateFormat("MM-dd-YYYY");
        custDateFormat("MM-dd-yyyy");
        custDateFormat("MMM-dd-yy");
        custDateFormat("-dd-MMM/YYY");
    }

    public static void custDateFormat(String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));
        System.out.println("The current time: "+ System.currentTimeMillis());
    }
}
