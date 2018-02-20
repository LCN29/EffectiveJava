package com.eigpay.idea.singleton;

/**
 * @author LCN
 * @date 2018-02-20 下午 09:16
 * description: 实现singleton的方式一
 * 特权客户端可以使用AccessibleObject.setAccessible方法，以反射方式调用私有构造方法。
 * 如果需要防御此攻击，请修改构造函数，使其在请求创建第二个实例时抛出异常
 */
public class One {

    public static final One INSTANCE = new One();

    private One(){
    }

    public void test() {
        System.out.println("单例实现方式一");
    }

}
