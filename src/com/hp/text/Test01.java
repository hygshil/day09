package com.hp.text;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("/myfile.txt");
        boolean newFile = f.createNewFile();
        System.out.println("文件名字"+f.getName());
        System.out.println("文件大小"+f.length());
        System.out.println(f.lastModified());//返回此抽象路径名表示的文件最后一次被修改的时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("文件最后修改时间"+df.format(f.lastModified()));

    }
}
