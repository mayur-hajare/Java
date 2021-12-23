package com.mh;

class Unique1 {
    public String Str = "";

    public String getStr() {
        return Str;
    }

    public void setStr(String str) {
        Str = str;
    }

    public void FindUnique() {
        String str = getStr();
        int j = 0;
        char s;
        char temp = str.charAt(j);
        for (; j <= str.length() - 1; j++) {
            for (int i = 1; i <= str.length() - 1; i++) {
                s = str.charAt(i);
                if (str.charAt(j) == s) {
                    System.out.println("Unique Letter is  : " + str.charAt(j));

                }
            }
        }
    }
}

public class Get_Unique_Letter {
    public static void main(String[] args) {
        Unique unique = new Unique();
        unique.setStr("hackthegame");
        unique.FindUnique();
    }
}
