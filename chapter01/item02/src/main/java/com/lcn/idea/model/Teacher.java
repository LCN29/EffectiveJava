package com.lcn.idea.model;

/**
 * description: JavaBean模式
 * 只提供一个无参的构造函数，
 * 所有属性提供setter方法，通过setter给属性赋值
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description: JavaBean模式
 */
public class Teacher {

    /**必填属性 */
    private String name;
    private String number;

    /** 非必填属性 */
    private String phone;
    private String address;

    public Teacher(){}

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
