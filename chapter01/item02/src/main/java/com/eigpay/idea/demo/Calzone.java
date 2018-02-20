package com.eigpay.idea.demo;

/**
 * @author LCN
 * @date 2018-02-19 下午 04:19
 * description: 半圆形烤乳酪馅饼 可以指定是否加酱汁
 */
public class Calzone extends BasePizza {
    /** 是否加酱汁 */
    private final boolean sauceInside;

    public static class Builder extends BasePizza.Builder<Builder> {
        /** 默认不加酱汁 */
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
