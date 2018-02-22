package com.eigpay.syntax.two;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 10:11
 */
public class Student implements Person {

    // 子类可以选择不实现默认方法

    @Override
    public void doSomethings() {
        System.out.println("做一些事情");
    }
}
