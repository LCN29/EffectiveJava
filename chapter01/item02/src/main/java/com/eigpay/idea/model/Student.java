package com.eigpay.idea.model;

/**
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description: 可伸缩（telescoping constructor）构造方法模式
 * 提供一个参数中必填的构造函数，提供一个包含所有参数的构造函数，
 * 然后从必填构造函数开始不断增加非必填参数的构造函数的个数
 */
public class Student {

    /**必填属性 */
    private String name;
    private String number;

    /** 非必填属性 */
    private String phone;
    private String address;


    public Student(String name, String number) {
        this(name,number,"没有");
    }

    public Student(String name, String number, String phone) {
        this(name,number,phone,"未填");
    }

    public Student(String name, String number, String phone, String address) {
        this.name = name;
        this.number = number;
        this.phone = phone;
        this.address = address;
    }

}
