package com.eigpay.syntax.one;

/**
 * description: 泛型自限定  <T extends Demo<T>>（递归类型参数 recursive type parameter）
 * 实现类继承了Demo,Demo要求的泛型T继承了Demo<T>，这样符合要求的只有自身或者子类了。
 * 这样和抽象方法self配合，可以让方法链在子类正常的执行，而不用强制转换
 * Java缺乏自我类型的这种变通解决方法被称为模拟自我类型（simulated self-type）的习惯用法
 *
 * @author LCN
 * @date 2018-02-22 上午 08:33
 */
public abstract class Demo<T extends Demo<T>> {

    /** 让实现类返回自身 this */
    protected abstract T self();

    public T test(){
        System.out.println("做一些处理");
        return self();
    }

    abstract void fn();

}
