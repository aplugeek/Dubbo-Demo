package com.aplugeek.provider;

import com.alibaba.dubbo.container.Main;

/**
 * 发布服务
 *
 * @author jerry.R
 */
public class PublishServer {
    /**
     * Main  dubbo提供的发布服务方法 需要在classpath下建立dubbo.properties
     * 指定 applicationContext.xml 路径
     * 或者 classPathXml方式拿到context.start()阻塞即可
     * @param args
     */
    public static void main(String[] args) {
        Main.main(args);
    }


}
