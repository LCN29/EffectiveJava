package com.lcn.idea.demo;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * description: 披萨的上面放的东西可以从指定的素材里面进行选择
 *
 * @author LCN
 * @date 2018-02-19 下午 04:19
 */
public abstract class BasePizza {

    public enum Topping {
        /** 披萨上面放的东西的选择 */
        HAM,
        MUSHROOM,
        ONION, PEPPER,
        SAUSAGE
    }

    /** 指定的披萨放的东西 */
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        /** 用于生成实例 */
        abstract BasePizza build();

        /**子类必须重写这个方法，并返回this */
        protected abstract T self();
    }

    BasePizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
