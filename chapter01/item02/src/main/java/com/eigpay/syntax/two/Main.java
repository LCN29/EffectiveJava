package com.eigpay.syntax.two;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 09:01
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Boy();
        Flower flower = person.buy();
        flower.flower();
        // flower.rose(); 编译报错

        //使用的是协变类型，所以可以进行强转
        Rose rose = (Rose) flower;
        rose.flower();
        rose.rose();
    }

}
