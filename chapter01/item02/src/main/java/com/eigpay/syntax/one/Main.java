package com.eigpay.syntax.one;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 08:38
 */
public class Main {

    public static void main(String[] args) {
        DemoImpl demo = new DemoImpl();
        // 方法链
        demo.test().fn();
    }

}
