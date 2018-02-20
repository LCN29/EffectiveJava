package com.eigpay.idea.singleton;

/**
 * @author LCN
 * @date 2018-02-20 下午 09:16
 *
 * description: 实现singleton的方式二
 * 好处: API明确表示这个是一个单例，而且他更简单。
 * 同时使用了静态工厂的方式:
 * （1）工厂方法返回唯一的实例，但是可以修改，比如，返回调用它的每个线程的单独实例等，而不用修改其他的Api，
 * （2）如果你的应用程序需要它，可以编写一个泛型单例工厂，
 * （3）方法引用可以用supplier，例如Elvis :: instance等同于Supplier<Elvis>（方法引用）
 */
public class Two {

    private static final Two INSTANCE = new Two();

    private Two(){
    }

    public static Two getInstance(){
        return INSTANCE;
    }

    public void test() {
        System.out.println("单例实现方式二");
    }

}
