package com.eigpay.idea.model.impl;


import com.eigpay.idea.model.Person;

/**
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description:
 */
public class StudentImpl implements Person {

    @Override
    public void showJob() {
        System.out.println("My job is a student");
    }

}
