package com.eigpay.syntax.two;

/**
 * description: 协变返回类型 (covariant return typing)
 *子类重写或者实现父类的方法，父类的方法要求返回的类型时T,而子类返回的类型时K,只要K是T的子类就可以
 *
 * @author LCN
 * @date 2018-02-22 上午 08:59
 */
public class Boy extends Person {

    @Override
    public Rose buy() {
        /**
         * 此处就是协变返回类型了
         * 重写父级的buy方法,父级返回的是Flower，而自身返回的是Rose,Rose extends Flower，所以成功
         */
        return new Rose();
    }

}
