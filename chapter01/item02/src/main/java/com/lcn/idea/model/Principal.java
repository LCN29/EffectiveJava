package com.lcn.idea.model;

/**
 * description: builder模式创建对象
 * (1)调用构造方法(或静态工厂),填充必填参数，获得一个Builder对象
 * (2)调用builder的setter方法，填充其他非必填的参数
 * (3)调用一个无参的build方法来生成对象
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 */
public class Principal {

    /**必填属性 */
    private String name;
    private String number;

    /** 非必填属性 */
    private String phone;
    private String address;

    public static class Builder {

        private String name;
        private String number;

        /** 非必填属性 */
        private String phone = "无";
        private String address = "未填";

        /**必填参数，通过构造函数填充 */
        public Builder(String name, String number) {
            this.name = name;
            this.number = number;
        }

        /**非必填函数通过setter方法填充 */
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        /** 通过builder方法获取实例 */
        public Principal build() {
            return new Principal(this);
        }

    }

    private Principal(Builder builder){
        name = builder.name;
        number = builder.number;
        phone = builder.phone;
        address = builder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
