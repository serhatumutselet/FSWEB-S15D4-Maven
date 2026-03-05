package org.example;
import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");



    }



    public static boolean checkForPalindrome(String text) {

        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        LinkedList<Character> charList=new LinkedList<>();
        for (char c: cleanedStr.toCharArray()){
            charList.add(c);
        }
        while(charList.size()>1){
            if ((!charList.pollFirst().equals(charList.pollLast()))){
                return false;
            }
        }
        return true;
    }
    public static String convertDecimalToBinary(int decimal){
        if (decimal == 0) {
            return "0";
        }

        boolean isNegative = decimal < 0;
        int number = Math.abs(decimal);
        LinkedList<Integer> binaryList=new LinkedList<>();

        while (number>0){
            int reminder=number%2;
            binaryList.addFirst(reminder);
            number=number/2;
        }
        StringBuilder binaryString=new StringBuilder();
        if (isNegative) {
            binaryString.append("-");
        }
        for (int digit:binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();

    }

}
