package Bai19.BaiTap.ValidateClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        System.out.println("Enter name class: ");
        Scanner scanner = new Scanner(System.in);
        String className = "C0318G";
        String regex = "(^?=[CAP])(.*\\d{4})(.*[GHIKLM]{1}$)";
        Pattern pattern = Pattern.compile(regex);
        CharSequence input;
        Matcher matcher = pattern.matcher(className);
        if (matcher.find()) {
            System.out.println("Name true");
        } else {
            System.out.println("Name false");
        }
    }
}
