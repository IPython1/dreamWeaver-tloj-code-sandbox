package com.dyj.tlojcodesandbox.security;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/4 22:23
 * @Description:默认安全管理器
 **/
public class BanAllSecurityManager extends SecurityManager{
    //检查所有的权限
    @Override
    public void checkPermission(java.security.Permission perm) {
        throw new SecurityException("权限不足"+perm.getActions());
//        System.out.println("默认不做任何权限限制");
//        System.out.println(perm);
//        super.checkPermission(perm);
    }

}
