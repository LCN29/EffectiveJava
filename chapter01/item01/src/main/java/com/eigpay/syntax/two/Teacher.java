package com.eigpay.syntax.two;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 10:29
 */
public class Teacher implements Person {

    // 子类也可以选择实现默认方法
    @Override
    public void sayWord() {
        System.out.println("老师说话了");
    }

    @Override
    public void doSomethings() {
    }
}
