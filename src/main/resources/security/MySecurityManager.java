package com.dyj.tlojcodesandbox.security;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/4 22:37
 * @Description:
 **/
public class MySecurityManager extends SecurityManager{

    //检查所有的权限
    @Override
    public void checkPermission(java.security.Permission perm) {
//        throw new SecurityException("权限不足"+perm.getActions());
//        System.out.println("默认不做任何权限限制");
//        System.out.println(perm);
//        super.checkPermission(perm);//默认所有权限都开
    }

    //检测程序是否可执行
    @Override
    public void checkExec(String cmd) {
//        super.checkExec(cmd);
        throw new SecurityException("checkExec权限异常"+cmd);
    }

    //检测程序是否可读文件
    @Override
    public void checkRead(String file) {
//        super.checkRead(file);
        if (file.contains("hutool")){
            return;
        }
//        throw new SecurityException("checkRead权限异常"+file);
    }

    //检测程序是否可写文件
    @Override
    public void checkWrite(String file) {
//        super.checkWrite(file);
//        throw new SecurityException("checkWrite权限异常"+file);
    }

    //检测程序是否可删除文件
    @Override
    public void checkDelete(String file) {
//        super.checkDelete(file);
//        throw new SecurityException("checkDelete权限异常"+file);
    }


    //检测程序是否可连接网络
    @Override
    public void checkConnect(String host, int port) {
//        super.checkConnect(host, port);
//        throw new SecurityException("checkConnect权限异常"+host+":"+port);
    }
}
