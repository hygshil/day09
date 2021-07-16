package com.hp.text;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
            System.out.println("请输入一个将要删除文件的文件名： ");
            Scanner scanner = new Scanner(System.in);
             String s = scanner.nextLine();
            //文件路径
            File file = new File("E:\\shixun\\项目\\day09\\"+s);
            //判断文件是否存在
            boolean exists = file.exists();
            //若存在，就删除文件
            if (exists) {
                file.delete();
                System.out.println(file+"已删除成功！");
            }else {
                System.out.println("您输入的文件或文件目录不存在！");
            }
    }
}
