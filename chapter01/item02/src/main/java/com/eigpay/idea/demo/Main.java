package com.eigpay.idea.demo;

import static com.eigpay.idea.demo.NyPizza.Size.SMALL;
import static com.eigpay.idea.demo.BasePizza.Topping.HAM;
import static com.eigpay.idea.demo.BasePizza.Topping.ONION;
import static com.eigpay.idea.demo.BasePizza.Topping.SAUSAGE;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-19 下午 04:19
 */
public class Main {

    public static void main(String[] args) {

        //可以指定披萨在上面的东西，有先后顺序

        // 纽约风格的披萨 可以定制大小
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        // 允许指定是否加酱汁,默认不加
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}
