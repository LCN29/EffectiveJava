package com.lcn.idea.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 */
public class AppStore {

    private AppStore() {}

    private static final Map<String, MusicProvider> PROVIDERS = new ConcurrentHashMap<String, MusicProvider>();

    //服务注册API
    public static void registerProvider(String name, MusicProvider p) {
        PROVIDERS.put(name, p);
    }

    //服务访问API
    public static MusicApp installApp(String name) {
        MusicProvider p = PROVIDERS.get(name);
        if (p==null) {
            throw new IllegalArgumentException("No provider registerd with name:" + name);
        }
        return p.getMusicApp();
    }
}
