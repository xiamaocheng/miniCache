package com.xiaxun.minicache;

import java.util.HashMap;

public class MiniCacheServer {
    private HashMap<String, Object> cache;

    private static MiniCacheServer instance;

    private MiniCacheServer() {
        cache = new HashMap<>();
    }

    public static MiniCacheServer getInstance() {
        if (instance == null) {
            synchronized (MiniCacheServer.class) {
                if (instance == null) {
                    instance = new MiniCacheServer();
                }
            }
        }
        return instance;
    }

    public void addCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getCache(String key) {
        return cache.get(key);
    }

    public void removeCache(String key) {
        cache.remove(key);
    }
}
