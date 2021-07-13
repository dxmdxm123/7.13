package com.du.stringclass;
/*
* StringBuilder（线程不安全），StringBuffer（线程安全  速度稍微慢） 解决 字符串频繁修改的问题
* 意思是把String升级了
* String 类  重点  重用性
* StringBuilder.Builder  更倾向于对字符串的修改
* 当用到字符大量的追加、修改、删除的时候，使用StringBuilder StringBuffer
* StringBuffer 的优点：内部有个  可变的字符串数组，速度快，内存消耗小
* 在公司实际开发中，字符串 增删改  要用StringBuffer，StringBuilder
*
* */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String str ="好好学习";
        StringBuilder sb = new StringBuilder(str);
        //1.追加
        sb.append("为了找工作");
        System.out.println("sb = " + sb);
        //2.修改
        sb.replace(10,19,"为了改变世界");
        System.out.println("sb = " + sb);
        //
        sb.deleteCharAt(2);//删除指定字符串
        System.out.println("sb = " + sb);
        //3.1 删除 字符区间  很常用  比如：www.goods.baudu.com
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //插入
        sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //5 字符串反转
        sb.reverse();
        System.out.println();

    }
}
