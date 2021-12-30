package Bai19.BaiTap.ValidatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    public static void main(String[] args) {
        String input = "(84)-(0978489648)";
        String regex = "(^\\(\\d{2}\\))[-](\\(0\\d{9}\\)$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
    }
}
