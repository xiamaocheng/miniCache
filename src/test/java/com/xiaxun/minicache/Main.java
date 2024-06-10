package com.xiaxun.minicache;

public class Main {
    public static void main(String[] args) {
        MiniCacheServer cacheServer = MiniCacheServer.getInstance();

        cacheServer.addCache("key1", "value1");
        cacheServer.addCache("key2", "value2");

        System.out.println(cacheServer.getCache("key1")); // 输出：value1

        cacheServer.removeCache("key1");

        System.out.println(cacheServer.getCache("key1")); // 输出：null
    }
}
