package com.eigpay.syntax.one;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 08:36
 */
public class DemoImpl extends Demo<DemoImpl> {

    @Override
    protected DemoImpl self() {
        return this;
    }

    @Override
    void fn() {
        System.out.println("自定义方法");
    }
}
