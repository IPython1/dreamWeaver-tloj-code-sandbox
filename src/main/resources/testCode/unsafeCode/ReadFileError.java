package com.dyj.tlojcodesandbox.unsafe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/4 19:55
 * @Description:读取服务器文件 （文件信息泄露）
 **/
public class ReadFileError {
    public static void main(String[] args) throws IOException, InterruptedException {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir+ File.separator+"src\\main\\resources\\application.yml";
        List<String> allLines= Files.readAllLines(Paths.get(filePath));
        System.out.println(String.join("\n",allLines));
    }
}
