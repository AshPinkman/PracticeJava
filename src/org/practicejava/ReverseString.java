package org.practicejava;

public class ReverseString {

    private static String rev1(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    private static String rev2(String s){
        char[] s1 = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            char temp = s1[left];
            s1[left] = s1[right];
            s1[right] = temp;
            left++;
            right--;
        }
        return new String(s1);
    }

    public static void main(String[] args) {
        System.out.println(rev1("selenium"));
        System.out.println(rev2("selenium"));
    }
}
