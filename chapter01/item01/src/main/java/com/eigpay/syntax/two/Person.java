package com.eigpay.syntax.two;

/**
 * description: 默认方法（JDK8新特性）
 * 默认方法就是接口可以有具体的实现方法，实现类可以不用实现的方法
 *
 * 技术在进步，原本一些以前没想到的或者做不到的事，在技术的发展后，
 * 可以实现了（如JDK8.0以前的集合类是没有foreach方法的）。所以有些接口在以前定义好的，
 * 为了方便等，在现在有需要进行修改。接口一旦修改了，所有的实现类都要修改，但是已经发布的版本是不允许修改的。
 * 所以引进的默认方法。他们的目的是为了解决接口的修改与现有的实现不兼容的问题。
 *
 * @author LCN
 * @date 2018-02-22 上午 10:10
 */
public interface Person {

    /**
     * 默认方法
     */
    default void sayWord (){
        doSomethings();
        System.out.println("有人在说话");
    }

    /**
     * 接口的默认方法可以像抽象类一样调用接口中未实现的方法
     */
    default void test(){
        doSomethings();
    }

    /**
     * 静态默认方法
     * 接口里面还支持提供静态默认方法，调用和普通的静态方法调用一致
     */
    static void saySomeWord() {
        System.out.println("呵呵...");
    }

    /**
     * 需要实现的方法
     */
    void doSomethings();

}
