package com.du.stringclass;
/*
* sb 对性能的影响
* */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        String str ="a";


        System.out.println(System.currentTimeMillis());
        long l=System.currentTimeMillis();

        for (int i = 0; i <30 ; i++) {
            str+=str;
            System.out.println("str = " + str);

        }
        System.out.println(System.currentTimeMillis()-l);
    }


}
