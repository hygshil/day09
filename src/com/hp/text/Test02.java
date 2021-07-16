package com.hp.text;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要创建的文件名：");
        String s = scanner.nextLine().trim();  //去除两边空白
        //截取文件名
        String b=".txt";
        String st = s.substring(0, s.indexOf(b));
        //输入的文件
        File file = new File(s);
        boolean exists = file.exists();//判断文件是否存在
        if(!exists){
            file.createNewFile(); //如果不存在创建文件
        }else{
            //如果存在
            System.out.println("文件已存在");
            int a = 0;
            while(exists){
                a++;
                file = new File(st+"_副本" + a + ".txt");
                System.out.println("file = " + file);
                exists = file.exists(); //判断文件是否存在
            }
            file.createNewFile();//当文件不存在时，跳出循环接着创建新文件
        }
        System.out.println("创建文件的名字为： " + file.getName());
        scanner.close();
    }
}
