package com.dyj.tlojcodesandbox.unsafe;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/4 20:13
 * @Description:运行其他程序(比如危险木马)
 **/
public class RunFileError {
    public static void main(String[] args) throws IOException, InterruptedException {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir+ File.separator+"src\\main\\resources\\木马程序.bat";
        //命令行执行的方式
        Process process = Runtime.getRuntime().exec(filePath);
        process.waitFor();
        //分批获取进程的正常输出                                                    先拿到进程的输入流
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
        //逐行读取
        String compileOutputLine;
        while ((compileOutputLine=bufferedReader.readLine())!=null){
            System.out.println(compileOutputLine);
        }
        System.out.println("执行异常程序成功");
    }
}
