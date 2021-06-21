    package com.leetcode.practice;

    public class CheckPalindrom {
        int resultLength;
        int resultStart;

        public static void main(String[] args) {
            String str = "babad";
            //System.out.println(solution("AABAA"));
            new CheckPalindrom().loginestPallindrom(str);
        }

        private void loginestPallindrom(String str) {
            for (int i = 0; i < str.length() - 1; i++) {
                checkPallindrom(str, i, i);
                checkPallindrom(str, i, i + 1);
            }
            System.out.println(str.substring(resultStart, resultStart + resultLength));
        }

        public static String solution(String word) {
            char[] c = word.toCharArray();
            int mid = (c.length - 1) / 2;
            int i = mid;
            int j = c.length % 2 != 0 ? mid : mid + 1;
            while (i >= 0 && j <= c.length - 1) {
                if (c[i] == c[j]) {
                    i--;
                    j++;
                } else {
                    return "Not palindrom";
                }

            }
            return "Palindrom";
        }

        public void checkPallindrom(String word, int i, int j) {

            while (i >= 0 && j <= word.length() && word.charAt(i) == word.charAt(j)) {

                i--;
                j++;

                if (resultLength < j - i - 1) {
                    resultLength = j - i - 1;
                    resultStart = i + 1;

                }

            }
        }
    }
