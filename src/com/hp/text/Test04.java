package com.hp.text;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //（创建文件）获取并输出当前目录下所有文件的名字
        File file = new File(".");
        //创建一个数组列表文件
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() || files[i].isDirectory()) {//判断是否是文件和目录
                System.out.println(files[i].getName());
            }
        }
    }
}

