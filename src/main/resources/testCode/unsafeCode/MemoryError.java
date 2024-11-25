package com.dyj.tlojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/4 19:33
 * @Description:无限占用空间 浪费系统内存
 **/
public class MemoryError {

    public static void main(String[] args) throws InterruptedException {
        //不能定义对象和简单的常量 因为jvm会自动回收
        List<byte[]> bytes=new ArrayList<>();
        while (true){
            bytes.add(new byte[1024*1024*10]);
        }
    }
}
