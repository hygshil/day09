package com.hp.text;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要创建的目录名：");
        String s = scanner.nextLine().trim();  //去除两边空白
        File file = new File(s);
        boolean exists = file.isDirectory();//判断目录是否存在
        if(!exists){
            file.mkdir();//如果不存在创建目录
        }else{
            //如果存在
            System.out.println("目录已存在");
            int a = 0;
            while(exists){
                a++;
                file = new File(s+"_副本" + a);
                System.out.println("file = " + file);
                exists = file.isDirectory(); //判断目录是否存在
            }
            file.mkdir();//当目录不存在时，跳出循环接着创建新目录
        }
        System.out.println("创建目录的名字为： " + file.getName());
        scanner.close();
    }
}
