package com.lession.recurssion;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombination {
    private  static String[] codes ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        List<String> result = getKeyPadC("678");
        System.out.println(result);
    }
    public static List<String> getKeyPadC(String combinations){
        if(combinations.length()==0){
            List<String> bstr = new ArrayList<>();
            bstr.add("");
            return bstr;
        }
        char ch = combinations.charAt(0);
        String strForRec = combinations.substring(1);
        List<String> rrec= getKeyPadC(strForRec);
        List<String> res = new ArrayList<>();
        for(char c: codes[ch-'0'].toCharArray()){
            for(String rstr:rrec){
                res.add(c+rstr);
            }
        }
        return res;
    }
}
