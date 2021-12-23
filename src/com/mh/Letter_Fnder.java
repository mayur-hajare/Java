package com.mh;

class Unique {
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
        for (int i = 1; i <= str.length() - 1; i++) {
            s = str.charAt(i);
            if (temp == s) {
                System.out.println("Element present at :" + i++);
                j++;

            }
        }
        System.out.println(j + 1);

    }

    public class Letter_Finder {
        public static void main(String[] args) {
            Unique1 unique = new Unique1();
            unique.setStr("hackthegame");
            unique.FindUnique();

        }
    }
}
