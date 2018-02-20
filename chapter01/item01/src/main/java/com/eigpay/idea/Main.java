package com.eigpay.idea;

import com.eigpay.idea.assist.GetPerson;
import com.eigpay.idea.model.Person;

/**
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description:
 */
public class Main {

    public static void main(String[] args) {
        // 通过静态工厂方式获取实例
        Person student = GetPerson.getStudent();
        Person teacher = GetPerson.getTeacher();

        student.showJob();
        teacher.showJob();
    }

}
