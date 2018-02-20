package com.eigpay.idea.demo;

import java.util.Objects;

/**
 * @author LCN
 * @date 2018-02-19 下午 04:19
 * description: 纽约风格的披萨可以指定尺寸
 */
public class NyPizza extends BasePizza {

    public enum Size {
        /** 披萨尺寸大小 */
        SMALL,
        MEDIUM,
        LARGE
    }
    private final Size size;

    public static class Builder extends BasePizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
