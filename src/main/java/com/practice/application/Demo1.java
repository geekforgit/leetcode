package com.practice.application;

//first the no repeated character in string
public class Demo1 {
    public static void main(String[] args) {
        String str = "kkwaabbbeccdd";

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                } else {
                    if (count < 2) {
                        System.out.println(charArray[i]);
                        return;
                    }
                    i = j;
                    count =1;
                    //System.out.println("i"+i);
                }
            }
            if(count==1)
                System.out.println(charArray[i]);
        }

    }

}
