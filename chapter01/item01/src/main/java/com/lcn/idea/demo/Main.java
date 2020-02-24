package com.lcn.idea.demo;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 */
public class Main {
    public static void main(String[] args) {
        AppStore.registerProvider("NetEase", new NetEaseMusicProvider());
        //以下为用户的操作
        MusicApp musicApp = AppStore.installApp("NetEase");
        musicApp.play();
    }
}
